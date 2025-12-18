public class PerformanceEvaluator extends AbstractEvaluator {

    @Override
    protected void assignRating(Employee e) {
        double s = e.getFinalScore();

        if (s >= 90) e.setRating("A - Excellent");
        else if (s >= 75) e.setRating("B - Very Good");
        else if (s >= 60) e.setRating("C - Good");
        else e.setRating("D - Needs Improvement");
    }

    @Override
    protected void checkBonusEligibility(Employee e) {
        e.setBonusEligible(e.getFinalScore() >= 75);
    }
}