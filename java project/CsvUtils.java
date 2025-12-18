

import java.io.*;
import java.util.*;

public class CsvUtils {

    public static List<Employee> loadEmployees(String path) {
        List<Employee> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line; 
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length < 3) continue;
                list.add(new Employee(p[0], p[1], p[2]));
            }
        } catch (Exception e) {
            System.out.println("Error loading employee CSV: " + e.getMessage());
        }
        return list;
    }

    public static Map<String, KPIRecord> loadKPI(String path) {
        Map<String, KPIRecord> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine(); // header skip
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length < 5) continue;
                map.put(
                        p[0],
                        new KPIRecord(
                                p[0],
                                Double.parseDouble(p[1]),
                                Double.parseDouble(p[2]),
                                Double.parseDouble(p[3]),
                                
                                Double.parseDouble(p[4])
                        )
                );
            }
        } catch (Exception e) {
            System.out.println("Error loading KPI CSV: " + e.getMessage());
        }
        return map;
    }

    public static void saveReport(String path, List<Employee> employees) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
            pw.println("EmpID,Name,Department,Score,Rating,Bonus");
            for (Employee e : employees) {
                pw.println(e.getEmpId() + "," + e.getName() + "," + e.getDepartment() +
                        "," + e.getFinalScore() + "," + e.getRating() + "," +
                        (e.isBonusEligible() ? "YES" : "NO"));
            }
        } catch (Exception e) {
            System.out.println("Error saving report: " + e.getMessage());
        }
    }
}

