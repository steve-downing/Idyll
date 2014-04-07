package org.stevedowning.commons.idyll.idfactory;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;

public interface IdFactory {
    public <T extends Identifiable<T>> Id<T> generateId();
}
