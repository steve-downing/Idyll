package org.suporma.idyll.idfactory;

import java.util.concurrent.atomic.AtomicLong;

import org.suporma.idyll.Identifiable;
import org.suporma.idyll.ids.LongId;

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
