package org.design_patterns.behaviour.iterator;


public class Main {
    public static void main(String[] args) {

        UserProfileHierarchyCollection userProfileHierarchyCollection = new UserProfileHierarchyCollection("test");
        var iterator = userProfileHierarchyCollection.createUserFamilyIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext().getEmail());
        }

    }
}