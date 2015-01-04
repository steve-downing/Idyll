package org.suporma.idyll.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.suporma.idyll.id.Id;
import org.suporma.idyll.id.Identifiable;

class WrapperIdMap<T extends Identifiable<? super T>> implements IdMap<T>, Serializable {
    private static final long serialVersionUID = -7295228543827599795L;

    private final Map<Id<? super T>, T> map;
    
    WrapperIdMap(Map<Id<? super T>, T> map) {
        this.map = map;
    }

    public void clear() {
        map.clear();
    }

    public boolean containsId(Id<? super T> id) {
        return map.containsKey(id);
    }

    public T get(Id<? super T> id) {
        return map.get(id);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public Set<Id<? super T>> getIds() {
        return map.keySet();
    }

    public void add(T val) {
        map.put(val.getId(), val);
    }

    public void addAll(Collection<? extends T> vals) {
        for (T val : vals) {
            add(val);
        }
    }

    public T remove(Id<? super T> id) {
        return map.remove(id);
    }

    public int size() {
        return map.size();
    }

    public Collection<T> values() {
        return map.values();
    }

    public Iterator<T> iterator() {
        return map.values().iterator();
    }
}
