package org.design_patterns.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganisationUnit{

    private List<OrganisationUnit> organisationUnits;

    public Department() {
        organisationUnits = new ArrayList<>();
    }

    public void addOrganizationUnit(OrganisationUnit organizationUnit) {
        this.organisationUnits.add(organizationUnit);
        System.out.println("Organization Unit Added!!");
    }

    @Override
    public double calculateTotalSalary() {
        return organisationUnits.stream().mapToDouble(OrganisationUnit::calculateTotalSalary).sum();
    }

}
