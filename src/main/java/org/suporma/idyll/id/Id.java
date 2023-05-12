package org.suporma.idyll.id;

public interface Id<T> extends Identifiable<T> {
    @Override
    public default Id<T> getId() { return this; }
}
