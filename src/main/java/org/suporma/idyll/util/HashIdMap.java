package org.suporma.idyll.util;

import java.util.HashMap;

import org.suporma.idyll.id.Id;
import org.suporma.idyll.id.Identifiable;

public final class HashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    private static final long serialVersionUID = -6739791722204768856L;

    public HashIdMap() {
        super(new HashMap<Id<? super T>, T>());
    }
}
