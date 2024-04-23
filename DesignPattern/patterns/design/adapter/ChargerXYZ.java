package DesignPattern.patterns.design.adapter;

public class ChargerXYZ implements AppleCharger{

    @Override
    public void ChargePhone() {
        System.out.println("Your Iphone 13 is charging");
    }
}
