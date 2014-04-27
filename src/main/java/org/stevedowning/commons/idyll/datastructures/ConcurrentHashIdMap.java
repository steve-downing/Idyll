package org.stevedowning.commons.idyll.datastructures;

import java.util.concurrent.ConcurrentHashMap;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;

public class ConcurrentHashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    public ConcurrentHashIdMap() {
        super(new ConcurrentHashMap<Id<? super T>, T>());
    }
}
