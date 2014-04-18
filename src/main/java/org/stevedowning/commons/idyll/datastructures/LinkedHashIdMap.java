package org.stevedowning.commons.idyll.datastructures;

import java.util.LinkedHashMap;
import java.util.Map;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;

public class LinkedHashIdMap<T extends Identifiable<? super T>> extends WrapperIdMap<T> {
    public LinkedHashIdMap(Map<Id<? super T>, T> map) {
        super(new LinkedHashMap<Id<? super T>, T>());
    }
}
