package org.suporma.idyll.id;

import java.io.Serializable;

public final class LongId<T extends Identifiable<T>> implements Id<T>, Serializable {
    private static final long serialVersionUID = -1804456232680133930L;
    private final long id;
    
    public LongId(long id) { this.id = id; }
    
    public long getLong() { return id; }
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
        LongId<?> other = (LongId<?>) obj;
        if (id != other.id)
            return false;
        return true;
    }
}