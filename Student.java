package app.Lab4;
import java.util.ArrayList;
import java.util.Observable;

public class Student extends Observable {
    String name;
    double grade;
    boolean dropLowestAssignment;
    ArrayList<Double> assignmentScores;
    ArrayList<Double> examScores;

    Student(String name) {
        this.name = name;
        assignmentScores = new ArrayList<>();
        examScores = new ArrayList<>();
    }
	public String getName() {
		return name;
	}
    public void addAssignmentScore(double assignmentScore){
        this.assignmentScores.add(assignmentScore);
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public double getAverage() {
        double averageGrade;
		if (!dropLowestAssignment) {
			ComputeStrategy grade = new ComputeAvgBasic(assignmentScores, examScores);
			averageGrade = grade.calculateAverage();
		} else {
			ComputeStrategy grade = new ComputeAvgAdvanced(assignmentScores, examScores);
			averageGrade = grade.calculateAverage();
        }
        
		setChanged();
		notifyObservers();
		return averageGrade;
    }

    public void setDropLowestAssign(boolean drop) {
        dropLowestAssignment = drop;
    }
}