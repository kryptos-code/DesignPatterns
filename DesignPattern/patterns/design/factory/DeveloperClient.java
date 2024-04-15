package DesignPattern.patterns.design.factory;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int salary1 = employee.salary();
        System.out.println("Android Salary: "+salary1);

        Employee employee1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salary2 = employee1.salary();
        System.out.println("WEB Salary: "+salary2);

        Employee employee3 = EmployeeFactory.getEmployee("FLUTTER DEVELOPER");
        int salary3 = employee3.salary();
        System.out.println("Flutter Salary: "+salary3);
    }
}
