package DesignPattern.patterns.design.abstract_factory;

public class EmployeeClient {

    public static void main(String[] args) {
        // I want to get android dev
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();

        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        e2.name();

        Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
        e3.name();

    }
}
