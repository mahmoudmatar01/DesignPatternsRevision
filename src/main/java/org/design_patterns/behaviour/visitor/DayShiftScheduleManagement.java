package org.design_patterns.behaviour.visitor;

public class DayShiftScheduleManagement implements ShiftScheduleManagement{

    @Override
    public void generateReport() {
        System.out.println("generate report for day shift : ........");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("calculate over time for day shift : ........");
    }

    @Override
    public void acceptVisitor(ShiftScheduleManagementVisitor shiftScheduleManagementVisitor) {
        shiftScheduleManagementVisitor.visit(this);
    }

}
