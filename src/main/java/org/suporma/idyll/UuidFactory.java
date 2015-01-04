package org.suporma.idyll;

import java.util.UUID;

public class UuidFactory implements IdFactory {
    @Override
    public <T extends Identifiable<T>> Id<T> generateId() {
        return new Uuid<T>(UUID.randomUUID());
    }
}
