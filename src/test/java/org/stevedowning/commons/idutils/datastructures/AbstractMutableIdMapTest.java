package org.stevedowning.commons.idutils.datastructures;

import junit.framework.TestCase;

import org.stevedowning.commons.idutils.IdMaps;
import org.stevedowning.commons.idutils.User;
import org.stevedowning.commons.idutils.idfactory.SimpleIdFactory;

public class AbstractMutableIdMapTest extends TestCase {
    public void testBasic() {
        SimpleIdFactory idFactory = new SimpleIdFactory();
        IdMap<User> map = IdMaps.newIdHashMap(idFactory);
    }
}
