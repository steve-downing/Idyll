package org.stevedowning.commons.idutils;

public interface MutablyIdentifiable<T, U extends Id<?>> extends Identifiable<T> {
    public void setId(U id);
}
