public class Employee {
    String employeeName;
    double employeeSalary;
    int workHours;
    int hireYear;

    public Employee(String employeeName, double employeeSalary, int workHours, int hireYear) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.employeeSalary < 1000){
            return 0;
        }else{
            double tax = employeeSalary * 0.3;
            return tax();
        }
    }

    public double bonus(){
        if(this.workHours <=40){
            return 0;
        }else{
            int bonus = (workHours - 40) * 30;
            return  bonus;
        }
    }

    public double raiseSalary(){
        if(hireYear <=0 || hireYear > 2022 ){
            System.out.println("You entered an invalid working year, please try again or check again!");
        }else{
            int fark = 2022 - hireYear;
            double raise;
            if(fark > 0 && fark <10){
                raise = employeeSalary * 0.05;
                return raise;
            }else if(fark > 9 && fark < 20){
                raise = employeeSalary * 0.1;
                return raise;
            } else if (fark > 19) {
                raise = employeeSalary * 1.5;
                return  raise;
            }
        }
        return 0;
    }
    public String toString(){
        double total = employeeSalary - tax() + bonus() + raiseSalary();
        double tot = employeeSalary + bonus() - tax();
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Employee Salary: " + this.employeeSalary);
        System.out.println("Weekly working hours: " + this.workHours);
        System.out.println("Start year of hire: " + this.hireYear);
        System.out.println("Tex:" + tax());
        System.out.println("Bonus:" + bonus());
        System.out.println("Salary increase amount: " + raiseSalary());
        System.out.println("Salary with Taxes and Bonuses: " + tot);
        System.out.println("Total Salary: " + total);

        return null;
    }

}
