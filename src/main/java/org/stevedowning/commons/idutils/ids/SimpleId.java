package org.stevedowning.commons.idutils.ids;

import org.stevedowning.commons.idutils.Id;
import org.stevedowning.commons.idutils.Identifiable;

public class SimpleId<T extends Identifiable<T>> implements Id<T> {
    private static final long serialVersionUID = -1804456232680133930L;
    private final long id;
    
    public SimpleId(long id) { this.id = id; }
    
    public String toString() { return Long.toString(id); }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SimpleId<?> other = (SimpleId<?>) obj;
        if (id != other.id)
            return false;
        return true;
    }
}