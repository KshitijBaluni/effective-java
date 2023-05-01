package org.example.serilization;

import java.io.*;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private transient String password; // marked as transient to prevent serialization

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(encrypt(password)); // encrypt and serialize the password separately
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        password = decrypt((String) in.readObject()); // decrypt and deserialize the password separately
    }

    // serialization proxy class to improve backward compatibility and prevent attacks
    private static class UserProxy implements Serializable {
        private String username;

        public UserProxy(User user) {
            this.username = user.getUsername();
        }

        private Object readResolve() {
            return getUserFromDatabase(username); // look up the user in a database or some other external source
        }
    }

    private Object writeReplace() {
        return new UserProxy(this); // return the serialization proxy object instead of the User object
    }

    private static String encrypt(String password) {
        // encrypt the password using a secure encryption algorithm
        return password;
    }

    private static String decrypt(String encryptedPassword) {
        // decrypt the password using the same secure encryption algorithm
        return encryptedPassword;
    }

    private static User getUserFromDatabase(String username) {
        // look up the user in a database or some other external source
        String password = "password123"; // for demo purposes only
        return new User(username, password);
    }
}

class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("JohnDoe", "password123");

        // serialize the user object
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(user);
        byte[] serializedUser = baos.toByteArray();

        // deserialize the user object
        ByteArrayInputStream bais = new ByteArrayInputStream(serializedUser);
        ObjectInputStream in = new ObjectInputStream(bais);
        User deserializedUser = (User) in.readObject();

        // print the deserialized user object
        System.out.println("Username: " + deserializedUser.getUsername());
        System.out.println("Password: " + deserializedUser.getPassword());
    }
}
