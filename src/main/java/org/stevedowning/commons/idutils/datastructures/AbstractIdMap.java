package org.stevedowning.commons.idutils.datastructures;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.stevedowning.commons.idutils.Id;
import org.stevedowning.commons.idutils.Identifiable;
import org.stevedowning.commons.idutils.exception.NullIdException;

public abstract class AbstractIdMap<T extends Identifiable<? super T>> implements IdMap<T> {
    private Map<Id<? super T>, T> map = null;
    
    protected abstract Map<Id<? super T>, T> getInitialMap();
    
    private synchronized void initializeMapIfNecessary() {
        if (map == null) map = getInitialMap();
    }
    
    public Map<Id<? super T>, T> getMap() {
        initializeMapIfNecessary();
        return map;
    }

    public void clear() {
        if (map != null) map.clear();
    }

    public boolean containsKey(Id<? super T> key) {
        if (map == null) {
            return false;
        } else {
            return map.containsKey(key);
        }
    }

    public boolean containsValue(T val) {
        if (map == null) {
            return false;
        } else {
            return map.containsValue(val);
        }
    }

    public Set<Entry<Id<? super T>, T>> entrySet() {
        initializeMapIfNecessary();
        return map.entrySet();
    }

    public T get(Id<? super T> key) {
        initializeMapIfNecessary();
        return map.get(key);
    }

    public boolean isEmpty() {
        if (map == null) {
            return true;
        } else {
            return map.isEmpty();
        }
    }

    public Set<Id<? super T>> keySet() {
        initializeMapIfNecessary();
        return map.keySet();
    }

    public T put(T val) {
        if (val.getId() == null) throw new NullIdException();
        initializeMapIfNecessary();
        return map.put(val.getId(), val);
    }

    public void putAll(Collection<T> vals) {
        initializeMapIfNecessary();
        for (T val : vals) {
            put(val);
        }
    }

    public T remove(Id<? super T> key) {
        initializeMapIfNecessary();
        return map.remove(key);
    }

    public int size() {
        if (map == null) {
            return 0;
        } else {
            return map.size();
        }
    }

    public Collection<T> values() {
        initializeMapIfNecessary();
        return map.values();
    }
}
