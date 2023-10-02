package Ssg05;

public class C02_Account extends C01_HR{
    public int perHour;
    public int workingHour;
    public int workingDay;
    public int salary;

    public int salaryCalculate(){
        salary=perHour*workingDay*workingDay;
        return salary;
    }

    public int getPerHour() {
        return perHour;
    }

    public void setPerHour(int perHour) {
        this.perHour = perHour;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
