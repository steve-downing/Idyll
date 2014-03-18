package org.stevedowning.commons.idutils;

import java.util.HashMap;
import java.util.Map;

import org.stevedowning.commons.idutils.datastructures.AbstractIdMap;
import org.stevedowning.commons.idutils.datastructures.IdMap;

public class IdMaps {
    public static <T extends Identifiable<T>> IdMap<T> newIdMap(final Map<Id<T>, T> backingMap) {
        return new AbstractIdMap<T>() {
            protected Map<Id<T>, T> getInitialMap() { return backingMap; }
        };
    }

    public static <T extends Identifiable<T>> IdMap<T> newIdHashMap() {
        return newIdMap(new HashMap<Id<T>, T>());
    }
}
