package org.design_patterns.behaviour.visitor;

public interface ShiftScheduleManagement {
    void generateReport();
    void calculateOverTime();
    void acceptVisitor(ShiftScheduleManagementVisitor shiftScheduleManagementVisitor);
}
