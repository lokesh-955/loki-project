

import java.util.List;

public class ReportGenerator {

    public static void printSummary(List<Employee> list) {
        System.out.println("\n------ EMPLOYEE PERFORMANCE REPORT ------");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
