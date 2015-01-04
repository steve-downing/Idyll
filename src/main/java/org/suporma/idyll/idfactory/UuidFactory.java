package org.suporma.idyll.idfactory;

import java.util.UUID;

import org.suporma.idyll.Id;
import org.suporma.idyll.Identifiable;
import org.suporma.idyll.ids.Uuid;

public class UuidFactory implements IdFactory {
    @Override
    public <T extends Identifiable<T>> Id<T> generateId() {
        return new Uuid<T>(UUID.randomUUID());
    }
}
