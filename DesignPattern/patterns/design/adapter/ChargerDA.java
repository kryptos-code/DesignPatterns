package DesignPattern.patterns.design.adapter;

public class ChargerDA implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Your android phone is charging");
    }
}
