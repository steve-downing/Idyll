package org.stevedowning.commons.idutils.idfactory;

import org.stevedowning.commons.idutils.Id;
import org.stevedowning.commons.idutils.Identifiable;

public interface IdFactory<T extends Id<?>> {
    public <U extends Identifiable<U>> Id<U> generateId();
}
