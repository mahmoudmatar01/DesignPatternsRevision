package org.design_patterns.behaviour.iterator;



public class UseMutualFriends implements UserProfileIterator {

    private int currentMutualFriendPosition;
    private final UserProfileHierarchyCollection userProfileHierarchyCollection;

    public UseMutualFriends(UserProfileHierarchyCollection userProfileHierarchyCollection) {
        this.userProfileHierarchyCollection = userProfileHierarchyCollection;
    }

    @Override
    public boolean hasNext() {
        return currentMutualFriendPosition < userProfileHierarchyCollection.getUserList().size();
    }

    @Override
    public User getNext() {
        System.out.println("Iterating through user mutual friends .........");
        if(!hasNext()){
            return null;
        }
        return userProfileHierarchyCollection.getUserList().get(currentMutualFriendPosition++);
    }
}
