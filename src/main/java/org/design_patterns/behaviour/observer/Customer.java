package org.design_patterns.behaviour.observer;

public class Customer implements Subscriber{

    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void notifySubscriber(String message) {
        System.out.println("Notify user "+name+" : "+message);
    }
}
