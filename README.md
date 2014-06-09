# Idyll

Idyll is a lightweight Java library for dealing with object identifiers. This library encourages additional type-safety by making it easy to use `Id<T>`s rather than `int`s to uniquely identify other objects.

## Why Generic IDs?

Java isn't perfect and you pay a cost for your IDE's complexity, but you use them in part because type-safety protects you and your team from an entire class of errors. You can press this advantage by taking type-safety even further. Any non-trivial project will sometimes toss around object IDs. Protect yourself from mixing up these ID types by applying generics.

## The Problem

A common pattern in Java is to use `int`s, or sometimes more complex but still unsafe objects, as unique identifiers. This isn't bad until you start identifying more than one type of object. When more than one type of object starts to rely on `int`s as identifiers, you open yourself up to the very errors that type-safety is supposed to save you from. For example:

    private void showPropertyValue(int userId, int propertyTypeId) {
        ...
    }

    private void confirmAddress(User user) {
        showPropertyValue(PropertyType.ADDRESS.getId(), user.getId());
        ...

The above code happily compiles. If you're lucky, it'll break in an obvious manner upon execution. In that case, you lose a minute or so with a compile-relaunch-observe cycle. In the worst case, you ship broken code.

## The Solution

Use `Id<T>`s instead of `int`s! The method signature from above becomes:

    private void showPropertyValue(Id<User> userId, Id<PropertyType> propertyTypeId) {
        ...
    }

From there, the improper call to `showPropertyValue()` fails to compile. Your IDE will give you quick feedback if you accidentally juxtapose your parameters, but it may have just suggested the right thing for you in the first place.

## Usage

Suggested usage is to have your objects implement the `Identifiable` interface, which only makes you implement the `getId()` method. For example:

    public class User implements Identifiable<User> {
        private final Id<User> id;
        private final String name;
    
        public User(Id<User> id, String name) {
            this.id = id;
            this.name = name;
        }
        
        public Id<User> getId() { return id; }
    }

### IdFactory

To help you generate IDs, there's a thread-safe `IdFactory` implementation `LongIdFactory`. Possible usage looks like this:

    IdFactory idFactory = new LongIdFactory(); // Generates IDs backed by longs.
    User steve = new User(idFactory.generateId(), "Steve");

Implementing your own `IdFactory` only entails defining a `generateId()` method.

### IdMap

Idyll also comes with the `IdMap` data structure, which makes it a little simpler to keep a collection of Identifiable objects:

    IdMap<User> users = new HashIdMap<User>();
    users.add(steve);
    users.add(kate);
    
    ...
    
    users.get(steveId); // Returns steve.
