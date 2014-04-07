package org.stevedowning.commons.idyll;

import java.util.HashMap;
import java.util.Map;

import org.stevedowning.commons.idyll.datastructures.AbstractIdMap;
import org.stevedowning.commons.idyll.datastructures.IdMap;

public class IdMaps {
    public static <T extends Identifiable<T>> IdMap<T> newIdMap(
            final Map<Id<? super T>, T> backingMap) {
        return new AbstractIdMap<T>() {
            protected Map<Id<? super T>, T> getInitialMap() { return backingMap; }
        };
    }

    public static <T extends Identifiable<T>> IdMap<T> newIdHashMap() {
        return newIdMap(new HashMap<Id<? super T>, T>());
    }
}
