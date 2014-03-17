package org.stevedowning.commons.idutils.datastructures;

import junit.framework.TestCase;

import org.stevedowning.commons.idutils.Id;
import org.stevedowning.commons.idutils.IdMaps;
import org.stevedowning.commons.idutils.TestUser;
import org.stevedowning.commons.idutils.idfactory.LongIdFactory;

public class AbstractIdMapTest extends TestCase {
    public void testBasic() {
        LongIdFactory idFactory = new LongIdFactory();
        IdMap<TestUser> userMap = IdMaps.newIdHashMap();
        Id<TestUser> steveId = idFactory.generateId();
        TestUser steve = new TestUser("Steve", steveId);
        TestUser kate = new TestUser("Kate", idFactory.<TestUser>generateId());
        
        userMap.put(steve);
        userMap.put(kate);
    }
}
