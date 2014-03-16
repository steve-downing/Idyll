package org.stevedowning.commons.idutils;

import java.util.HashMap;
import java.util.Map;

import org.stevedowning.commons.idutils.datastructures.AbstractIdMap;
import org.stevedowning.commons.idutils.datastructures.AbstractMutableIdMap;
import org.stevedowning.commons.idutils.datastructures.IdMap;
import org.stevedowning.commons.idutils.idfactory.IdFactory;

public class IdMaps {
    public static <T extends Identifiable<T>> IdMap<T> newIdHashMap() {
        return new AbstractIdMap<T>() {
            protected Map<Id<T>, T> getInitialMap() { return new HashMap<Id<T>, T>(); }
        };
    }
    public static <T extends MutablyIdentifiable<T, U>, U extends Id<T>> IdMap<T> newIdHashMap(
            IdFactory<U> idFactory) {
        AbstractMutableIdMap<T, U> map = new AbstractMutableIdMap<T, U>() {
            protected Map<Id<T>, T> getInitialMap() { return new HashMap<Id<T>, T>(); }
        };
        map.setIdFactory(idFactory);
        return map;
    }
}
