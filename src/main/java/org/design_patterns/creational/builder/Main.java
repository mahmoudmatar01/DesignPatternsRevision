package org.design_patterns.creational.builder;

public class Main {

    public static void main(String[]args){

        // first way
        Employee employee = new Employee.EmployeeBuilder().
                setId(1)
                .setAge(22)
                .setName("Mahmoud Matar")
                .setPhone("01128673348")
                .build();
        System.out.println(employee.toString());


        // second way
        Notification notification = new NotificationBuilder()
                .setTitle("Notification Title")
                .setBody("Notification Body")
                .build();
        System.out.println(notification.toString());
    }
}
