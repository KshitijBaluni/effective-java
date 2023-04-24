Java Generics is a feature introduced in Java 5 that allows you to write reusable code that can work with different types of objects. Generics provide type safety and help to eliminate runtime errors by allowing the compiler to enforce type constraints. Here are some notes on using Java Generics with examples:

1. Declaring a Generic Type: 
   You can declare a generic type by using angle brackets "<>" followed by the name of the type parameter. For example, to create a generic class for a list of strings, you can declare it as follows:
   ``` java
   public class MyList<T> {
   // ...
   }
   ```

2. Using a Generic Type: 
   Once you have declared a generic type, you can use it to create instances of the class by providing the type argument in the angle brackets. For example, to create an instance of MyList for strings, you can do the following:
   ``` java
   MyList<String> myList = new MyList<>();
   ```
   
3. Limiting Type Parameters:
   You can limit the type of objects that can be used as the type argument by using the "extends" keyword. For example, to create a generic class that works with only Number and its subclasses, you can declare it as follows:
   ``` java
      public class MyNumber<T extends Number> {
   // ...
   }
   ```
   
4. Wildcards: 
   Wildcards allow you to work with unknown types in a generic class. There are two types of wildcards: the upper bounded wildcard and the unbounded wildcard. Here are some examples:

   - Upper bounded wildcard: The upper bounded wildcard allows you to specify that the unknown type must be a subtype of a particular type. This is useful when you want to work with a generic type that can accept a range of subtypes. For example, suppose you have a method that takes a list of Numbers and you want to print the contents of the list. You can use an upper bounded wildcard to ensure that the list contains only Number and its subtypes:
    ``` java 
   public void printList(List<? extends Number> list) {
    for (Number n : list) {
       System.out.println(n);
      }
    }
   ```
   In this example, the "?" represents an unknown type that must be a subtype of Number. The method can now accept a list of Integer, Double, or any other subclass of Number.
   - Unbounded wildcard:
   The unbounded wildcard allows you to work with a generic type that can accept any type. This is useful when you want to write a method that can work with any type of object without knowing its type at compile time. For example, suppose you have a method that takes a list of objects and you want to print the contents of the list. You can use an unbounded wildcard to achieve this:
   
    ``` java
   public void printList(List<?> list) {
    for (Object o : list) {
       System.out.println(o);
      }
    }
    ```
   In this example, the "?" represents an unknown type that can be any type of object. The method can now accept a list of any type, including Integer, String, or any other object.

In conclusion, wildcards provide a flexible way to work with unknown types in a generic class or method. By using the upper bounded wildcard or the unbounded wildcard, you can write generic code that can accept a range of subtypes or any type of object, respectively.

5. Generic Methods: 
   You can also declare generic methods within a class. Here's an example:
``` java
public class MyUtils {
  public static <T> T getLast(List<T> list) {
    // ...
  }
}
```

6. Erasure:
   Generics are implemented using erasure, which means that the type information is removed at runtime. This can cause some limitations, such as not being able to create arrays of generic types. To work around this, you can use arrays of a raw type or use collections instead of arrays.




 

