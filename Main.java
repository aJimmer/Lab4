package app.Lab4;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Lab 4...");

        Student aj = new Student("Angel Jimenez");
        aj.addAssignmentScore(98.5);
        aj.addAssignmentScore(90.1);
        aj.addAssignmentScore(78.3);
        aj.addExamScore(95.0);
        aj.addExamScore(87.0);

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(aj.getName() + "  " + df.format(aj.getAverage()));

        aj.setDropLowestAssign(true);
        System.out.println(aj.getName() + "  " + df.format(aj.getAverage()));
                           
        aj.setDropLowestAssign(false);
        System.out.println(aj.getName() + "  " + df.format(aj.getAverage()));
        
        GradeTracker gradeTracker = new GradeTracker(aj);
        System.out.println("letter grade: " + gradeTracker.getLetterGrade());
        aj.addExamScore(33);
        System.out.println("Added an exam score.");
        System.out.println("letter grade: " + gradeTracker.getLetterGrade());
        
        Student se = new Student("Someone Else");
        se.addAssignmentScore(96.2);
        se.addAssignmentScore(98.1);
        se.addAssignmentScore(99.3);
        se.addExamScore(95);
        se.addExamScore(97);
        
        Roster roster = new Roster("ADV SWE","5800");
        roster.addStudent(aj);
        roster.addStudent(se);
        
        System.out.println("ADV SWE grades:");
        AvgDispenser averages = roster.getDispenser();
        while (!averages.done()) {
            System.out.println("Next Average "  + df.format(averages.getNextAvg()));
        } 
    }
}