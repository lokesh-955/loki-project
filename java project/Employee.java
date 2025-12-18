
public class Employee {
    private String empId;
    private String name;
    private String department;
    private double finalScore;
    private String rating;
    private boolean bonusEligible; 

    public Employee(String empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    public String getEmpId() { return empId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    public double getFinalScore() { return finalScore; }
    public void setFinalScore(double finalScore) { this.finalScore = finalScore; }

    public void setRating(String rating) { this.rating = rating; }
    public String getRating() { return rating; }

    public boolean isBonusEligible() { return bonusEligible; }
    public void setBonusEligible(boolean status) { this.bonusEligible = status; }

    @Override
    public String toString() {
        return empId + " - " + name + " - " + department +
                " | Score: " + finalScore + " | Rating: " + rating +
                " | Bonus: " + (bonusEligible ? "YES" : "NO");
    }
}