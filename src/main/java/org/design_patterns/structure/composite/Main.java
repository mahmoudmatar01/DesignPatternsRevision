package org.design_patterns.structure.composite;

public class Main {

    public static void main(String[] args) {

        // create three employees
        OrganisationUnit mahmoud = new Employee(1,"mahmoud",12300);
        OrganisationUnit ahmed = new Employee(2,"ahmed",43000);
        OrganisationUnit ziad = new Employee(3,"ziad",256000);

        // create first department
        Department devOopsDepartment = new Department();
        devOopsDepartment.addOrganizationUnit(mahmoud);
        devOopsDepartment.addOrganizationUnit(ahmed);
        double totalDevOopSalary = devOopsDepartment.calculateTotalSalary();
        System.out.println(totalDevOopSalary);

        System.out.println("-------------------------------------");

        // create second department with its sub department
        Department backendDepartment = new Department();
        backendDepartment.addOrganizationUnit(ziad);
        backendDepartment.addOrganizationUnit(devOopsDepartment);
        double totalBackendDepartmentSalary = backendDepartment.calculateTotalSalary();
        System.out.println(totalBackendDepartmentSalary);

    }
}
