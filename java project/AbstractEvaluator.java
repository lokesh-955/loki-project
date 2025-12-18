

import java.util.List;
import java.util.Map;

public abstract class AbstractEvaluator {

    public final void evaluate(List<Employee> empList, Map<String, KPIRecord> kpiMap,
                               WeightingPolicy policy) {

        for (Employee e : empList) {
            KPIRecord kpi = kpiMap.get(e.getEmpId());
            if (kpi != null) {
                double score = policy.calculateWeightedScore(kpi);
                e.setFinalScore(score);
                assignRating(e);
                checkBonusEligibility(e);
            }
        }
    }

    protected abstract void assignRating(Employee e);

    protected abstract void checkBonusEligibility(Employee e);
}