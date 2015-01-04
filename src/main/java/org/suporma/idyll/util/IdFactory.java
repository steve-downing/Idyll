package org.suporma.idyll.util;

import org.suporma.idyll.id.Id;
import org.suporma.idyll.id.Identifiable;


public interface IdFactory {
    public <T extends Identifiable<T>> Id<T> generateId();
}
