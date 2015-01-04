package org.suporma.idyll;


public interface IdFactory {
    public <T extends Identifiable<T>> Id<T> generateId();
}
