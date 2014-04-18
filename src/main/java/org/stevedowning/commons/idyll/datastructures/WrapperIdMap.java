package org.stevedowning.commons.idyll.datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;
import org.stevedowning.commons.idyll.exception.NullIdException;

public class WrapperIdMap<T extends Identifiable<? super T>> implements IdMap<T> {
    private final Map<Id<? super T>, T> map;
    
    public WrapperIdMap(Map<Id<? super T>, T> map) {
        this.map = map;
    }

    public void clear() {
        map.clear();
    }

    public boolean containsId(Id<? super T> key) {
        return map.containsKey(key);
    }

    public T get(Id<? super T> key) {
        return map.get(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public Set<Id<? super T>> getIds() {
        return map.keySet();
    }

    public void add(T val) {
        if (val.getId() == null) throw new NullIdException();
        map.put(val.getId(), val);
    }

    public void addAll(Collection<? extends T> vals) {
        for (T val : vals) {
            add(val);
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

    public Iterator<T> iterator() {
        return map.values().iterator();
    }

    public void forEach(Consumer<? super T> action) {
        map.values().forEach(action);
    }

    public Spliterator<T> spliterator() {
        return map.values().spliterator();
    }
}
