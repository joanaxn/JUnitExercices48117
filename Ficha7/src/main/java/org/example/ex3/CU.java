package org.example.ex3;
import org.example.ex3.Mark;

import java.util.ArrayList;

public class CU {
    String nameCU;
    ArrayList<Mark> marks;
    int totalStudents;


    public CU(String nameCU, int totalStudents) {
        this.nameCU = nameCU;
        this.totalStudents = totalStudents;
        this.marks = new ArrayList<>();
    }

    public void insertMarkCU(int numStudent, double mark) {
        for (Mark m : marks) {
            if (m.numStudent == numStudent) {
                m.mark = mark;
                return;
            }
        }
        if (marks.size() < totalStudents) {
            marks.add(new Mark(numStudent, mark));
        }
    }

    public double searchStudent(int numStudent) {
        for (Mark m : marks) {
            if (m.numStudent == numStudent) {
                return m.mark;
            }
        }
        return -1;
    }


    public double averageCU() {
        if (marks.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (Mark m : marks) {
            sum += m.mark;
        }

        double average = sum / marks.size();
        return average;
    }

    public boolean isApproved(int numStudent) {
        double mark = searchStudent(numStudent);
        return mark >= 9.5;
    }
}
