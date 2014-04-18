package org.stevedowning.commons.idyll.datastructures;

import java.util.Collection;
import java.util.Set;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;

public interface IdMap<T extends Identifiable<? super T>> extends Iterable<T> {
    public void add(T val);
    public void addAll(Collection<? extends T> vals);
    public void clear();
    public boolean containsId(Id<? super T> key);
    public T get(Id<? super T> key);
    public boolean isEmpty();
    public Set<Id<? super T>> getIds();
    public T remove(Id<? super T> key);
    public int size();
}
