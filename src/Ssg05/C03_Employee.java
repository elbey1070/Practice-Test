package Ssg05;

public class C03_Employee extends C02_Account {
    public static void main(String[] args) {
        C03_Employee worker = new C03_Employee("Tom","Hanks","0505091070","Baku",20,30,5);
        System.out.println(worker);
        C03_Employee worker2 = new C03_Employee();
        worker2.id = worker2.idRegister();
        System.out.println(worker2);
        C03_Employee worker3 = new C03_Employee("John","Ma","994502565","Kurdemir",22,25,6);
        worker2.id =worker3.idRegister();
        worker3.setName("Jack");
        System.out.println(worker3.adress);
        System.out.println(worker3);
        System.out.println(worker3.salaryCalculate());


    }

    public C03_Employee() {
    }

    @Override
    public String toString() {
        return "C03_Employee{" +
                "perHour=" + perHour +
                ", workingHour=" + workingHour +
                ", workingDay=" + workingDay +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", adress='" + adress + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", id=" + id +
                '}';
    }

    public C03_Employee(String name, String surName, String phone, String adress, int perHour, int workingHour, int workingDay) {
        this.id=idRegister();
        this.name=name;
        this.surName=surName;
        this.phone=phone;
        this.adress=adress;
        this.perHour=perHour;
        this.workingHour=workingHour;
        this.workingDay=workingDay;
    }
}
