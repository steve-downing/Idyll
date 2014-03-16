package org.stevedowning.commons.idutils.idfactory;

import java.util.concurrent.atomic.AtomicLong;

import org.stevedowning.commons.idutils.Identifiable;
import org.stevedowning.commons.idutils.ids.SimpleId;

public class SimpleIdFactory implements IdFactory<SimpleId<?>> {
    private final AtomicLong counter = new AtomicLong(0);

    public <T extends Identifiable<T>> SimpleId<T> generateId() {
        return new SimpleId<T>(counter.getAndIncrement());
    }
}
