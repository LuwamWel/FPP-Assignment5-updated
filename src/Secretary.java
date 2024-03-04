public class Secretary extends DeptEmployee{
    double overtimeHours;

    public Secretary(String name, double salary, int aYear, int aMonth, int aDay) {
        super(name, salary, aYear, aMonth, aDay);
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    @Override
    double computeSalary(){
        return salary + (12 * overtimeHours);

    }
}
