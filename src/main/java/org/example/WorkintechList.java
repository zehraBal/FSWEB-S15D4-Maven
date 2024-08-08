package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WorkintechList<E extends Comparable<E>> extends ArrayList<E> {

    @Override
    public boolean add(E element) {
        if (!this.contains(element)) {
            super.add(element);
            this.sort();
            return true;
        }
        return false;
    }


    public void sort() {
        Collections.sort(this);
    }

    // Remove method with sorting
    @Override
    public boolean remove(Object o) {
        boolean result = super.remove(o);
        if (result) {
            this.sort();
        }
        return result;
    }
}