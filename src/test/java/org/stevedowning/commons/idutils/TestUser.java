package org.stevedowning.commons.idutils;

public class TestUser implements MutablyIdentifiable<TestUser, LongId<TestUser>> {
    private LongId<TestUser> id = null;
    private final String name;
    
    public TestUser(String name) { this.name = name; }
    public TestUser(String name, LongId<TestUser> id) {
        this(name);
        this.id = id;
    }
    
    public String getName() { return name; }

    public LongId<TestUser> getId() { return id; }
    public void setId(LongId<TestUser> id) { this.id = id; }
}
