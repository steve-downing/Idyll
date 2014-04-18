package org.stevedowning.commons.idyll.datastructures;

import junit.framework.TestCase;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.IdMaps;
import org.stevedowning.commons.idyll.TestUser;
import org.stevedowning.commons.idyll.idfactory.LongIdFactory;
import org.stevedowning.commons.idyll.ids.LongId;

public class AbstractIdMapTest extends TestCase {
    private static enum SpecialUserId implements Id<TestUser> {
        ANONYMOUS_USER_ID, ADMIN_USER_ID;
    }
    
    public void testBasic() {
        LongIdFactory idFactory = new LongIdFactory();
        IdMap<TestUser> userMap = IdMaps.newIdHashMap();
        LongId<TestUser> steveId = idFactory.generateId();
        TestUser steve = new TestUser("Steve", steveId);
        TestUser kate = new TestUser("Kate", idFactory.<TestUser>generateId());
        
        userMap.add(steve);
        userMap.add(kate);
        
        assertTrue(userMap.containsId(steveId));
        assertEquals(steve, userMap.get(steveId));
        assertEquals(2, userMap.size());
    }
    
    public void testEnumId() {
        TestUser anon = new TestUser("Anonymous", SpecialUserId.ANONYMOUS_USER_ID);
        TestUser admin = new TestUser("Admin", SpecialUserId.ADMIN_USER_ID);
        
        IdMap<TestUser> userMap = IdMaps.newIdHashMap();
        userMap.add(anon);
        userMap.add(admin);

        assertTrue(userMap.containsId(SpecialUserId.ANONYMOUS_USER_ID));
        assertEquals(anon, userMap.get(SpecialUserId.ANONYMOUS_USER_ID));
        assertEquals(2, userMap.size());
    }
}
