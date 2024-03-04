public class EmployeeDriver {
    public static void main(String[] args) {

        Employee [] employees = new Employee[4];

        employees[0] = new CommissionEmployee("Jonn", "Doe", "12345", 200, 10);
        employees[1] = new HourlyEmployee("Tom", "Johnson", "12345", 45, 40);
        employees[2] = new SalariedEmployee("Kristine", "Micheal", "12345", 1500);
        employees[3] = new BasePlusCommissionEmployee("Sara", "John", "12345", 200, 10, 2000);

        double totalSalaryOfAllEmployees =0;
        for(Employee emp: employees){
            System.out.println(emp);
            totalSalaryOfAllEmployees +=emp.getPayment();
        }
        System.out.println("--------------------------------------------");
        System.out.println("The total salary of all employees is: " + totalSalaryOfAllEmployees);
    }
}
