package org.stevedowning.commons.idyll.idfactory;

import java.util.concurrent.atomic.AtomicLong;

import org.stevedowning.commons.idyll.Identifiable;
import org.stevedowning.commons.idyll.ids.LongId;

public final class LongIdFactory implements IdFactory {
    private final AtomicLong counter = new AtomicLong(0);

    public <T extends Identifiable<T>> LongId<T> generateId() {
        LongId<T> id = new LongId<T>(counter.getAndIncrement());
        return id;
    }
}
