package org.stevedowning.commons.idyll.datastructures;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;
import org.stevedowning.commons.idyll.exception.NullIdException;

public class WrapperIdMap<T extends Identifiable<? super T>> implements IdMap<T> {
    private final Map<Id<? super T>, T> map;
    
    public WrapperIdMap(Map<Id<? super T>, T> map) {
        this.map = map;
    }
    
    public Map<Id<? super T>, T> getMap() {
        return map;
    }

    public void clear() {
        map.clear();
    }

    public boolean containsKey(Id<? super T> key) {
        return map.containsKey(key);
    }

    public boolean containsValue(T val) {
        return map.containsValue(val);
    }

    public Set<Entry<Id<? super T>, T>> entrySet() {
        return map.entrySet();
    }

    public T get(Id<? super T> key) {
        return map.get(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public Set<Id<? super T>> keySet() {
        return map.keySet();
    }
    
    public T add(T val) {
        return put(val);
    }

    public T put(T val) {
        if (val.getId() == null) throw new NullIdException();
        return map.put(val.getId(), val);
    }

    public void putAll(Collection<T> vals) {
        for (T val : vals) {
            put(val);
        }
    }

    public T remove(Id<? super T> key) {
        return map.remove(key);
    }

    public int size() {
        return map.size();
    }

    public Collection<T> values() {
        return map.values();
    }
}
