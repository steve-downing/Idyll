package org.stevedowning.commons.idutils.idfactory;

import org.stevedowning.commons.idutils.Id;
import org.stevedowning.commons.idutils.Identifiable;

public interface IdFactory {
    public <T extends Identifiable<T>> Id<T> generateId();
}
