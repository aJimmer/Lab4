package app.Lab4;
import java.util.ArrayList;

public class ComputeAvgBasic extends ComputeStrategy {
    
    public ComputeAvgBasic(ArrayList<Double> assignmentScores, ArrayList<Double> examScores){
        super(assignmentScores, examScores);
    }

    public double calculateAverage() {
        return (.6 * (examsScoresSum()/examScores.size())) + (.4 * (assignmentScoresSum()/assignmentScores.size()));
    }
}