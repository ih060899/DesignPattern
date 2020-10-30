package com.adapter;

public class School {
    public static void main(String[] args) {
        Pen penAdapter = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(penAdapter);
        assignmentWork.writeAsignment("I am tired.....");
    }
}
