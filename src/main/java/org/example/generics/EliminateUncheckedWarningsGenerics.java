package org.example.generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EliminateUncheckedWarningsGenerics {
    private Set<Lark> exaltation = new HashSet<>();

    public static void main(String[] args) {
        final boolean add = new EliminateUncheckedWarningsGenerics().exaltation.add(new Lark());
        System.out.println(add);
    }
}

class Lark {

}
