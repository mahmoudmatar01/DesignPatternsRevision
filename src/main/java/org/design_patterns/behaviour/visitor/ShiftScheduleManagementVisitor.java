package org.design_patterns.behaviour.visitor;

public interface ShiftScheduleManagementVisitor {
    void visit(RemoteShiftScheduleManagement remoteShiftScheduleManagement);
    void visit(DayShiftScheduleManagement dayShiftScheduleManagement);
    void visit(NightShiftScheduleManagement nightShiftScheduleManagement);
}
