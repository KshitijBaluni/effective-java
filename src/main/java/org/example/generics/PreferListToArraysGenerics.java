package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class PreferListToArraysGenerics<T> {
    private List<T> preferList;

    public PreferListToArraysGenerics(List<T> preferList) {
        this.preferList = preferList;
    }

    public T chooseFromPreferedList(int select) {
        return preferList.get(select);
    }
}
