package app.Lab4;
interface GradeTrackerInterface {
    public char getLetterGrade();
}

public class GradeTracker implements GradeTrackerInterface {
    private Student student;
    private double studentAverage;

    GradeTracker(Student student) {
        this.student = student;
    }

    public char getLetterGrade() {
        double percent = student.getAverage();
        char convertedPercentToLetter;
        if (percent >= 90.0) convertedPercentToLetter = 'A';
        else if (percent >= 80.0 && percent < 90.0) convertedPercentToLetter = 'B';
        else if (percent >= 70.0 && percent < 80.0) convertedPercentToLetter = 'C';
        else if (percent >= 60.0 && percent < 70.0) convertedPercentToLetter = 'D';
        else convertedPercentToLetter = 'F';
        return convertedPercentToLetter;
    } 
}