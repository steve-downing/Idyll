package org.suporma.idyll.idfactory;

import org.suporma.idyll.Id;
import org.suporma.idyll.Identifiable;

public interface IdFactory {
    public <T extends Identifiable<T>> Id<T> generateId();
}
