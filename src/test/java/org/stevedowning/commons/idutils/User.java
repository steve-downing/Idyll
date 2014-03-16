package org.stevedowning.commons.idutils;

import org.stevedowning.commons.idutils.ids.SimpleId;

public class User implements MutablyIdentifiable<User, SimpleId<User>> {
    private Id<User> id = null;
    private final String name;
    
    public User(String name) { this.name = name; }
    
    public String getName() { return name; }

    public Id<User> getId() { return id; }
    public void setId(SimpleId<User> id) { this.id = id; }
}
