package org.suporma.idyll.datastructures;

import java.util.LinkedHashMap;

import org.suporma.idyll.Id;
import org.suporma.idyll.Identifiable;

public final class LinkedHashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    private static final long serialVersionUID = -2926317362556044433L;

    public LinkedHashIdMap() {
        super(new LinkedHashMap<Id<? super T>, T>());
    }
}
