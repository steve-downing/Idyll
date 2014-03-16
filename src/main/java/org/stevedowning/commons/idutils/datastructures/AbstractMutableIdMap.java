package org.stevedowning.commons.idutils.datastructures;

import org.stevedowning.commons.idutils.Id;
import org.stevedowning.commons.idutils.MutablyIdentifiable;
import org.stevedowning.commons.idutils.exception.NullIdException;
import org.stevedowning.commons.idutils.idfactory.IdFactory;

public abstract class AbstractMutableIdMap<T extends MutablyIdentifiable<T, U>, U extends Id<T>> extends AbstractIdMap<T> {
    private IdFactory<U> idFactory = null;
    
    public void setIdFactory(IdFactory<U> idFactory) {
        this.idFactory = idFactory;
    }
    
    @SuppressWarnings("unchecked") // Casting id to U is known to be okay in this case.
    public T put(T val) {
        if (val.getId() == null) {
            if (idFactory == null) {
                throw new NullIdException();
            } else {
                Id<?> id = idFactory.generateId();
                val.setId((U)id);
            }
        }
        return super.put(val);
    }
}
