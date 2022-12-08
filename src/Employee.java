public class Employee {
    String name;
    int age;
    double salary;
    String location;

    public Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public double raiseSalary(double raiseAmount){
       double newSalary =  this.salary + raiseAmount;
       return newSalary;
    }

}
