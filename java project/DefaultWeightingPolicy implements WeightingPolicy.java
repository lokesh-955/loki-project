

public class DefaultWeightingPolicy implements WeightingPolicy {

    @Override
    public double calculateWeightedScore(KPIRecord kpi) {

        double score =
                (kpi.getAttendance() * 0.25) +
                (kpi.getTaskCompletion() * 0.40) +
                (kpi.getTeamwork() * 0.20) +
                (kpi.getInnovation() * 0.15);

        return score;
    }
}
