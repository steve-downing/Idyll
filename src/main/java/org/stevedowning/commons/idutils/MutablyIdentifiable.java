package org.stevedowning.commons.idutils;

public interface MutablyIdentifiable<T, U extends Id<T>> extends Identifiable<T> {
    public void setId(U id);
    public U getId();
}
