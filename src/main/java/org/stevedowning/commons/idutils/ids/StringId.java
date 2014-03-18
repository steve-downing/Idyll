package org.stevedowning.commons.idutils.ids;

import org.stevedowning.commons.idutils.Id;
import org.stevedowning.commons.idutils.Identifiable;

public class StringId<T extends Identifiable<T>> implements Id<T> {
    private static final long serialVersionUID = -8483099264639445749L;
    private final String id;
    
    public StringId(String id) {
        this.id = id;
    }
    
    public String getString() { return id; }
    public String toString() { return id; }

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
        StringId<?> other = (StringId<?>) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
