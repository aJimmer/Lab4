package app.Lab4;

import java.util.ArrayList;
import java.util.ListIterator;

interface AvgDispenser {
    double getNextAvg();
    boolean done();
}

public class Roster {
    private String courseName;
    private String courseNumber;
    private ArrayList<Student> students;


    Roster(String className, String classNumber) {
        this.courseName = className;
        this.courseNumber = classNumber;
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    } 

    public void addStudent(Student student) {
        students.add(student);
    }

    public AvgDispenser getDispenser() {
        return new AvgDispenser() {

            ListIterator<Student> rosterIterator = students.listIterator();

            public double getNextAvg() {
                return rosterIterator.next().getAverage();
            }

            public boolean done() {
                return !rosterIterator.hasNext();
            }
        };
    }
}