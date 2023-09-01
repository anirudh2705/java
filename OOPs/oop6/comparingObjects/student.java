package oop6.comparingObjects;

public class student implements Comparable<student> {
    int roll;
    int marks;

    student(int roll, int marks){
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(student o) {
        int diff = (int)(this.marks - o.marks);
        // if diff == 0 then both are equal
        // if diff < 0 then o is bigger else smaller
        return diff;
    }
}
