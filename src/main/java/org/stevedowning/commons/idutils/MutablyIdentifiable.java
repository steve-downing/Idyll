package org.stevedowning.commons.idutils;

public interface MutablyIdentifiable<T extends MutablyIdentifiable<T, U>, U extends Id<?>> extends Identifiable<T> {
    public void setId(U id);
}
