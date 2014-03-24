package org.stevedowning.commons.idutils.idfactory;

import java.util.concurrent.atomic.AtomicLong;

import org.stevedowning.commons.idutils.Identifiable;
import org.stevedowning.commons.idutils.ids.LongId;

public class LongIdFactory implements IdFactory {
    private final AtomicLong counter = new AtomicLong(0);

    public <T extends Identifiable<T>> LongId<T> generateId() {
        return new LongId<T>(counter.getAndIncrement());
    }
}
