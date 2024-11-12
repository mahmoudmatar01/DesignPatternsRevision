package org.design_patterns.behaviour.iterator;


public class UserFriendsIterator implements UserProfileIterator {

    private final UserProfileHierarchyCollection userProfileCollection;
    private int currentUserFriendPosition = 0;

    public UserFriendsIterator(UserProfileHierarchyCollection userProfileCollection) {
        this.userProfileCollection = userProfileCollection;
    }

    @Override
    public boolean hasNext() {
        return currentUserFriendPosition < userProfileCollection.getUserList().size();
    }

    @Override
    public User getNext() {
        System.out.println("Iterating over user friends ...... ");
        if(!hasNext()){
            return null;
        }
        return userProfileCollection.getUserList().get(currentUserFriendPosition++);
    }
}
