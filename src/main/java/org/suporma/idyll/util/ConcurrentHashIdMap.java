package org.suporma.idyll.util;

import java.util.concurrent.ConcurrentHashMap;

import org.suporma.idyll.id.Id;
import org.suporma.idyll.id.Identifiable;

public final class ConcurrentHashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    private static final long serialVersionUID = 5022352615447614477L;

    public ConcurrentHashIdMap() {
        super(new ConcurrentHashMap<Id<? super T>, T>());
    }
}
