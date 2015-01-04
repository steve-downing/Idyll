package org.suporma.idyll.datastructures;

import java.util.HashMap;

import org.suporma.idyll.Id;
import org.suporma.idyll.Identifiable;

public final class HashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    private static final long serialVersionUID = -6739791722204768856L;

    public HashIdMap() {
        super(new HashMap<Id<? super T>, T>());
    }
}
