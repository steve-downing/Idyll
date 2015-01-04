package org.suporma.idyll.util;

import java.util.Collection;
import java.util.Set;

import org.suporma.idyll.id.Id;
import org.suporma.idyll.id.Identifiable;

public interface IdMap<T extends Identifiable<? super T>> extends Iterable<T> {
    public void add(T val);
    public void addAll(Collection<? extends T> vals);
    public void clear();
    public boolean containsId(Id<? super T> id);
    public T get(Id<? super T> id);
    public boolean isEmpty();
    public Set<Id<? super T>> getIds();
    public T remove(Id<? super T> id);
    public int size();
    public Collection<T> values();
}
