package app.Lab4;
import java.util.ArrayList;

abstract public class ComputeStrategy {
    ArrayList<Double> assignmentScores;
    ArrayList<Double> examScores;

    public ComputeStrategy(){

    }
    public ComputeStrategy(ArrayList<Double> assignments, ArrayList<Double> exams){
        this.assignmentScores = assignments;
        this.examScores = exams;
    }

    public double examsScoresSum(){
        double totalOfExams = 0;
        for (double exam : examScores) totalOfExams += exam;
        return totalOfExams;
    }

    public double assignmentScoresSum(){
        double totalOfAssingmens = 0;
        for (double assignment : assignmentScores) totalOfAssingmens += assignment;
        return totalOfAssingmens;
    }
    public int indexOfLowestAssign(){
        double lowest = 100;
        int indexLowest = 0;
        for (double assignment : assignmentScores){
            if(assignment < lowest){
                indexLowest = assignmentScores.indexOf(assignment);
                lowest = assignment;
            }
        }
        return indexLowest;
    }
    abstract public double calculateAverage();
}