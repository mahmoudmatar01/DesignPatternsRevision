package org.design_patterns.behaviour.visitor;

public class RemoteShiftScheduleManagement implements ShiftScheduleManagement{

    @Override
    public void generateReport() {
        System.out.println("generate report for remote shift : ........");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("calculate over time for remote shift : ........");
    }

    @Override
    public void acceptVisitor(ShiftScheduleManagementVisitor shiftScheduleManagementVisitor) {
        shiftScheduleManagementVisitor.visit(this);
    }
}
