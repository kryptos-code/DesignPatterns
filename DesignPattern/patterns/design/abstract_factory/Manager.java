package DesignPattern.patterns.design.abstract_factory;

public class Manager implements Employee{

    @Override
    public int salary() {
        return 75000;
    }

    @Override
    public String name() {
        System.out.println("I am a Manager.");
        return "Manager";
    }
}
