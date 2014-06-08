package org.stevedowning.commons.idyll.datastructures;

import java.util.HashMap;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;

public final class HashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    private static final long serialVersionUID = -6739791722204768856L;

    public HashIdMap() {
        super(new HashMap<Id<? super T>, T>());
    }
}
