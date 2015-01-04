package org.suporma.idyll.util;

import java.util.LinkedHashMap;

import org.suporma.idyll.id.Id;
import org.suporma.idyll.id.Identifiable;

public final class LinkedHashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    private static final long serialVersionUID = -2926317362556044433L;

    public LinkedHashIdMap() {
        super(new LinkedHashMap<Id<? super T>, T>());
    }
}
