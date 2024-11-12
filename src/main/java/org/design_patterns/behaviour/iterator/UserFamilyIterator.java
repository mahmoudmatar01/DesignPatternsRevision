package org.design_patterns.behaviour.iterator;



public class UserFamilyIterator implements UserProfileIterator {

    private int currentUserFamilyPosition = 0;
    private final UserProfileHierarchyCollection userProfileHierarchyCollection;

    public UserFamilyIterator(UserProfileHierarchyCollection userProfileCollection) {
        this.userProfileHierarchyCollection = userProfileCollection;
    }

    @Override
    public boolean hasNext() {
        return currentUserFamilyPosition < userProfileHierarchyCollection.getUserList().size();
    }

    @Override
    public User getNext() {
        System.out.println("Iterating over user family ...... ");
        if(!hasNext()){
            return null;
        }
        return userProfileHierarchyCollection.getUserList().get(currentUserFamilyPosition++);
    }
}
