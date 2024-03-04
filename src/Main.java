import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        DeptEmployee[] department = new DeptEmployee[5];

        department[0] = new DeptEmployee("John", 80000.00, 2020, 1, 15);
        department[1] = new DeptEmployee("Tina", 90000.00, 2021, 2, 16);
        department[2] = new DeptEmployee("Mike", 100000.00, 2022, 3, 17);
        department[3] = new DeptEmployee("Janet", 70000.00, 2023, 4, 18);
        department[4] = new DeptEmployee("Peter", 65000.00, 2024, 5, 19);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you wish to see the sum of all Professor and Secretary salary in the department? Enter \"Y\" for yes and \"N\" for No");
        if(scanner.next().toUpperCase().equals("Y")){
            double sumOfEmployeesSalary = 0.0;
            for(DeptEmployee employee: department){
                sumOfEmployeesSalary += employee.salary;
            }
            System.out.println("The sum of all Professors and Secretary salary is: "+ sumOfEmployeesSalary);
        }else{
            System.out.println("Good bye");
        }

    }
}
