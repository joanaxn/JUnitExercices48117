package org.example.ex3;

public class Mark {
    int numStudent;
    double mark;


    public Mark(int numStudent, double mark) {
        this.numStudent = numStudent;
        this.mark = mark;
    }

    public int getNumStudent() {
        return numStudent;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
