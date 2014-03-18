package org.stevedowning.commons.idutils.datastructures;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

import org.stevedowning.commons.idutils.Id;
import org.stevedowning.commons.idutils.Identifiable;

public interface IdMap<T extends Identifiable<T>> {
    public void clear();
    public boolean containsKey(Id<T> key);
    public boolean containsValue(T val);
    public Set<Entry<Id<T>, T>> entrySet();
    public T get(Id<T> key);
    public boolean isEmpty();
    public Set<Id<T>> keySet();
    public T put(T val);
    public void putAll(Collection<T> vals);
    public T remove(Id<T> key);
    public int size();
    public Collection<T> values();
}
