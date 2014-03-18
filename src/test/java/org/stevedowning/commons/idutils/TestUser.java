package org.stevedowning.commons.idutils;

public class TestUser implements MutablyIdentifiable<TestUser, Id<TestUser>> {
    private Id<TestUser> id = null;
    private final String name;
    
    public TestUser(String name) { this.name = name; }
    public TestUser(String name, Id<TestUser> id) {
        this(name);
        this.id = id;
    }
    
    public String getName() { return name; }

    public Id<TestUser> getId() { return id; }
    public void setId(Id<TestUser> id) { this.id = id; }
}
