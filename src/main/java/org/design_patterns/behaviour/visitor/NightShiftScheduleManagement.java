package org.design_patterns.behaviour.visitor;

public class NightShiftScheduleManagement implements ShiftScheduleManagement{

    @Override
    public void generateReport() {
        System.out.println("generate report for night shift : ........");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("calculate over time for night shift : ........");
    }

    @Override
    public void acceptVisitor(ShiftScheduleManagementVisitor shiftScheduleManagementVisitor) {
        shiftScheduleManagementVisitor.visit(this);
    }

}
