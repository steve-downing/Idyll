package org.stevedowning.commons.idutils.datastructures;

import junit.framework.TestCase;

import org.stevedowning.commons.idutils.IdMaps;
import org.stevedowning.commons.idutils.TestUser;
import org.stevedowning.commons.idutils.idfactory.LongIdFactory;
import org.stevedowning.commons.idutils.ids.LongId;

public class AbstractIdMapTest extends TestCase {
    public void testBasic() {
        LongIdFactory idFactory = new LongIdFactory();
        IdMap<TestUser> userMap = IdMaps.newIdHashMap();
        LongId<TestUser> steveId = idFactory.generateId();
        TestUser steve = new TestUser("Steve", steveId);
        TestUser kate = new TestUser("Kate", idFactory.<TestUser>generateId());
        
        userMap.put(steve);
        userMap.put(kate);
        
        assertTrue(userMap.containsKey(steveId));
        assertEquals(steve, userMap.get(steveId));
        assertEquals(2, userMap.size());
    }
}
