package DesignPattern.patterns.design.adapter;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Program started::");

        //AppleCharger charger = new ChargerXYZ();
        //Iphone13 iphone13 = new Iphone13(charger);
        AdapterCharger newCharger = new AdapterCharger( new ChargerDA());
        Iphone13 iphone13 = new Iphone13(newCharger);
        iphone13.chargeIphone();




    }
}
