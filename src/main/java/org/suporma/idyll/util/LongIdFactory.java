package org.suporma.idyll.util;

import java.util.concurrent.atomic.AtomicLong;

import org.suporma.idyll.id.Identifiable;
import org.suporma.idyll.id.LongId;

public final class LongIdFactory implements IdFactory {
    private final AtomicLong counter;
    
    public LongIdFactory() {
        this(0);
    }
    
    public LongIdFactory(long initialIdVal) {
        counter = new AtomicLong(initialIdVal);
    }

    public <T extends Identifiable<T>> LongId<T> generateId() {
        LongId<T> id = new LongId<T>(counter.getAndIncrement());
        return id;
    }
}
