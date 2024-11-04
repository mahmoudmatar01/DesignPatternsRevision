package org.design_patterns.creational.builder;

public class Employee {

    private final Integer id;
    private final String name;
    private final Integer age;
    private final String phone;

    private Employee(EmployeeBuilder builder){
        this.age=builder.getAge();
        this.id=builder.getId();
        this.name=builder.getName();
        this.phone=builder.getPhone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class EmployeeBuilder{
        private Integer id;
        private String name;
        private Integer age;
        private String phone;

        public Integer getId() {
            return id;
        }

        public EmployeeBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public EmployeeBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public EmployeeBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
