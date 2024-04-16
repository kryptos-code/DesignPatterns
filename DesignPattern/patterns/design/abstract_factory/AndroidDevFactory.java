package DesignPattern.patterns.design.abstract_factory;

public class AndroidDevFactory extends EmployeeAbstractFactory{


    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
