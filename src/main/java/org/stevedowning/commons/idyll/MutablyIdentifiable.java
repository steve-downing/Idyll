package org.stevedowning.commons.idyll;

public interface MutablyIdentifiable<T, U extends Id<T>> extends Identifiable<T> {
    public void setId(U id);
    public U getId();
}
