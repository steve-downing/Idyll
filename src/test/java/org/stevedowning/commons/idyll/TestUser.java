package org.stevedowning.commons.idyll;

import org.stevedowning.commons.idyll.Id;
import org.stevedowning.commons.idyll.Identifiable;

public class TestUser implements Identifiable<TestUser> {
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