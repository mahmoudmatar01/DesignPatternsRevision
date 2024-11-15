package org.design_patterns.behaviour.visitor;

public class ManageLeaveRequestVisitor implements ShiftScheduleManagementVisitor {

    @Override
    public void visit(RemoteShiftScheduleManagement remoteShiftScheduleManagement) {
        System.out.println("Manage leaving requests for remote shift schedule");
    }

    @Override
    public void visit(DayShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("Manage leaving requests for day shift schedule");
    }

    @Override
    public void visit(NightShiftScheduleManagement nightShiftScheduleManagement) {
        System.out.println("Manage leaving requests for night shift schedule");
    }
}
