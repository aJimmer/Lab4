package app.Lab4;

import java.util.ArrayList;
import java.util.Arrays;

public class ComputeAvgAdvanced extends ComputeStrategy {

    public ComputeAvgAdvanced(ArrayList<Double> assingmentScores, ArrayList<Double> examScores){
        super(assingmentScores, examScores);
    }

    public double calculateAverage(){
        double average;
        average = .6 * (examsScoresSum()/examScores.size());
        average += (.4 * ((assignmentScoresSum() - assignmentScores.get(indexOfLowestAssign()))/(assignmentScores.size() - 1)));
        return average;
    }
}