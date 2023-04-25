package org.example.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreferListToArrayGenericsTest {
    @Test
    public void testPreferListToArrayClass() {
        List<String> sampleString = new ArrayList<>();
        sampleString.add("Let us");
        sampleString.add("Test");
        sampleString.add("Preffered String");
        PreferListToArraysGenerics preferListToArraysGenerics = new PreferListToArraysGenerics<String>(sampleString);

        assertEquals("Preffered String", preferListToArraysGenerics.chooseFromPreferedList(2));
        assertEquals("Test", preferListToArraysGenerics.chooseFromPreferedList(1));
        assertEquals("Let us", preferListToArraysGenerics.chooseFromPreferedList(0));
    }
}
