interface Employee{

    double calculateSalary();

}

class FullTimeEmployee implements Employee{

    private double monthSalary;

    public FullTimeEmployee(double monthSalary){
        this.monthSalary = monthSalary;
    }

    @Override
    public double calculateSalary(){
        return monthSalary;
    }
}

class PartTimeEmployee implements Employee{

    private double hoursRate;
    private int hoursWorked;

    public PartTimeEmployee(double hoursRate, int hoursWorked){
        this.hoursRate = hoursRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return hoursRate * hoursWorked;
    }
}

public class EmployeeSalaryCalculation {

    public static void main(String[] args) {

        Employee fullTimeEmployee = new FullTimeEmployee(50000);
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.calculateSalary());

        Employee partTimeEmployee = new PartTimeEmployee(300, 50);
        System.out.println("Part-Time Employee Salary: " + partTimeEmployee.calculateSalary());
    }
    
}