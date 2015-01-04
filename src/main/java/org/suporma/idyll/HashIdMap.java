package org.suporma.idyll;

import java.util.HashMap;

public final class HashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    private static final long serialVersionUID = -6739791722204768856L;

    public HashIdMap() {
        super(new HashMap<Id<? super T>, T>());
    }
}
