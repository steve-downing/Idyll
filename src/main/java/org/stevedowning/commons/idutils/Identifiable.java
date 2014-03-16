package org.stevedowning.commons.idutils;

public interface Identifiable<T extends Identifiable<T>> {
    public Id<T> getId();
}
