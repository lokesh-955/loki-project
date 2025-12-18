

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        Map<String, KPIRecord> kpiMap = new HashMap<>();

        PerformanceEvaluator evaluator = new PerformanceEvaluator();
        WeightingPolicy policy = new DefaultWeightingPolicy();
        while (true) {
            System.out.println("\n===== EMPLOYEE PERFORMANCE & BONUS SYSTEM =====");
            System.out.println("1. Load Employee CSV");
            System.out.println("2. Load KPI CSV");
            System.out.println("3. Evaluate Performance");
            System.out.println("4. Show Report");
            System.out.println("5. Export CSV Report");        
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    employees = CsvUtils.loadEmployees("employees.csv");
                    System.out.println("Loaded Employees: " + employees.size());
                    break;

                case 2:
                    kpiMap = CsvUtils.loadKPI("kpi.csv");
                    System.out.println("Loaded KPI Records: " + kpiMap.size());
                    break;

                case 3:
                    evaluator.evaluate(employees, kpiMap, policy);
                    System.out.println("Evaluation Completed.");
                    break;   

                case 4:
                    ReportGenerator.printSummary(employees);
                    break;

                case 5:
                    CsvUtils.saveReport("performance_report.csv", employees);
                    System.out.println("Report Saved: performance_report.csv");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Option!");
            }
        }
    }
}