
public class KPIRecord {
    private String empId;
    private double attendance;
    private double taskCompletion;
    private double teamwork;
    private double innovation;

    public KPIRecord(String empId, double attendance, double taskCompletion,
                     double teamwork, double innovation) {
        this.empId = empId;
        this.attendance = attendance;
        this.taskCompletion = taskCompletion;
        this.teamwork = teamwork;
        this.innovation = innovation;
    }

    public String getEmpId() { return empId; }
    public double getAttendance() { return attendance; }
    public double getTaskCompletion() { return taskCompletion; }
    public double getTeamwork() { return teamwork; }
    public double getInnovation() { return innovation; }
}

