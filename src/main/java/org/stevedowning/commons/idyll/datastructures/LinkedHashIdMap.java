package org.stevedowning.commons.idyll.datastructures;

import java.util.LinkedHashMap;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;

public final class LinkedHashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    private static final long serialVersionUID = -2926317362556044433L;

    public LinkedHashIdMap() {
        super(new LinkedHashMap<Id<? super T>, T>());
    }
}
