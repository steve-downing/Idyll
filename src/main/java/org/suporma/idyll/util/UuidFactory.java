package org.suporma.idyll.util;

import java.util.UUID;

import org.suporma.idyll.id.Id;
import org.suporma.idyll.id.Identifiable;
import org.suporma.idyll.id.Uuid;

public class UuidFactory implements IdFactory {
    @Override
    public <T extends Identifiable<T>> Id<T> generateId() {
        return new Uuid<T>(UUID.randomUUID());
    }
}
