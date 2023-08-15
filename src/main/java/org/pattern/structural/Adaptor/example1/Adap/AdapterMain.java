package org.pattern.structural.Adaptor.example1.Adap;

import org.pattern.structural.Adaptor.example1.Pen.Pen;
import org.pattern.structural.Adaptor.example1.Pen.PenAdapter;

public class AdapterMain {
    public static void main(String[] args) {
        Pen pen = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setP(pen);
        assignmentWork.writeAssignment("I am bit tired for writing assignment");
    }
}
