package org.design_patterns.behaviour.iterator;


public interface Iterator {
    UserProfileIterator createUserFriendsIterator();
    UserProfileIterator createUserFamilyIterator();
    UserProfileIterator createUserMutualFriendsIterator();
}
