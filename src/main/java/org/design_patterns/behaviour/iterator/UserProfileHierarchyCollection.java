package org.design_patterns.behaviour.iterator;


import java.util.List;

public class UserProfileHierarchyCollection implements Iterator {

    private final List<User> userList;
    private final String userId;

    public UserProfileHierarchyCollection(String userId) {
        this.userId = userId;
        this.userList = List.of(
                new User(1,"Mahmoud","mahmoud@gmail.com"),
                new User(2,"Ahmed","ahmed@gmail.com"),
                new User(3,"Mostafa","mostafa@gmail.com")
        );
    }

    public List<User> getUserList() {
        return userList;
    }

    @Override
    public UserProfileIterator createUserFriendsIterator() {
        return new UserFriendsIterator(this);
    }

    @Override
    public UserProfileIterator createUserFamilyIterator() {
        return new UserFamilyIterator(this);
    }

    @Override
    public UserProfileIterator createUserMutualFriendsIterator() {
        return new UseMutualFriends(this);
    }
}
