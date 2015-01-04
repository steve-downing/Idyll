package org.suporma.idyll;

import junit.framework.TestCase;

import org.suporma.idyll.HashIdMap;
import org.suporma.idyll.Id;
import org.suporma.idyll.IdMap;
import org.suporma.idyll.LongId;
import org.suporma.idyll.LongIdFactory;

public class AbstractIdMapTest extends TestCase {
    private static enum SpecialUserId implements Id<TestUser> {
        ANONYMOUS_USER_ID, ADMIN_USER_ID;
    }
    
    public void testBasic() {
        LongIdFactory idFactory = new LongIdFactory();
        IdMap<TestUser> userMap = new HashIdMap<TestUser>();
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
        
        IdMap<TestUser> userMap = new HashIdMap<TestUser>();
        userMap.add(anon);
        userMap.add(admin);

        assertTrue(userMap.containsId(SpecialUserId.ANONYMOUS_USER_ID));
        assertEquals(anon, userMap.get(SpecialUserId.ANONYMOUS_USER_ID));
        assertEquals(2, userMap.size());
    }
}
