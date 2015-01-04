package org.suporma.idyll.id;

import java.io.Serializable;
import java.util.UUID;

public class Uuid<T extends Identifiable<T>> implements Id<T>, Serializable {
    private static final long serialVersionUID = 6072262846320135898L;
    private final UUID id;
    
    public Uuid(UUID id) {
        this.id = id;
    }
    
    public Uuid(byte[] name) {
        this.id = UUID.nameUUIDFromBytes(name);
    }
    
    public Uuid(String name) {
        this.id = UUID.fromString(name);
    }
    
    public UUID getUuid() { return id; }
    public String toString() { return id.toString(); }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Uuid<?> other = (Uuid<?>) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
