package DesignPattern.patterns.design.factory;

public class AndriodDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Android developer salary");
        return 50000;
    }
}
