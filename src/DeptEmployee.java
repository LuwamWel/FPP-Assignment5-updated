import java.time.LocalDate;

public class DeptEmployee {
    String name;
    double salary;
    LocalDate hireDate;

    public DeptEmployee(String name, double salary, int aYear, int aMonth, int aDay){
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(aYear, aMonth, aDay);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    double computeSalary(){
        return salary;
    }
}
