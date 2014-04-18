package org.stevedowning.commons.idyll.datastructures;

import java.util.HashMap;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;

public class HashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    public HashIdMap() {
        super(new HashMap<Id<? super T>, T>());
    }
}
