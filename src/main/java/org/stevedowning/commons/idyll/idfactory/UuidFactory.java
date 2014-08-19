package org.stevedowning.commons.idyll.idfactory;

import java.util.UUID;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;
import org.stevedowning.commons.idyll.ids.Uuid;

public class UuidFactory implements IdFactory {
    @Override
    public <T extends Identifiable<T>> Id<T> generateId() {
        return new Uuid<T>(UUID.randomUUID());
    }
}
