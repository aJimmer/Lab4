package app.Lab4;

import java.util.Observer;
import java.util.Observable;

public class StudentAverageObserver implements Observer{

    private double studentAverage;

    public StudentAverageObserver(Student student){
        student.addObserver(this);
        studentAverage = student.getAverage();
    }

    public void update(Observable obj, Object arg){
        Student student = (Student) obj;
        int compareResult = Double.compare(studentAverage, student.getAverage());
        if(compareResult != 0){
            studentAverage = student.getAverage();
        }
    }
}