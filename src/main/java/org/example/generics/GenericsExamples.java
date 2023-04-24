package org.example.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Generics Examples
 *
 * @author kshitijbaluni
 * @since 24 April,2023
 */
public class GenericsExamples {
    private final Collection<Stamp> stamps = new ArrayList();

    public void dontUseRawTypeThrowClassCastException() {
        stamps.add(new Stamp());
        //stamps.add(new Coin());

        // Raw iterator type - don't do this!
        //This will throw class cast exception, as stamps have both Stamp and Coin object
        /*for (Iterator i = stamps.iterator(); i.hasNext(); ) {
            Stamp stamp = (Stamp) i.next();
            System.out.println("stamp : " + stamp);
        }*/
    }

    public void dontUseRawType() {
        stamps.add(new Stamp());
        //At compile time its checking the class is Stamp or not
        //stamps.add(new Coin());

        // Using Generic type now
        for (Iterator i = stamps.iterator(); i.hasNext(); ) {
            Stamp stamp = (Stamp) i.next();
            System.out.println("stamp : " + stamp);
        }
    }

    public static void main(String[] args) {
        new GenericsExamples().dontUseRawType();
    }
}

class Stamp {
    public Stamp() {
        System.out.println("Stamp Object is Created");
    }

    @Override
    public String toString() {
        return "Stamp{}";
    }
}
class Coin {
    public Coin() {
        System.out.println("Coin Object is Created");
    }

    @Override
    public String toString() {
        return "Coin{}";
    }
}
