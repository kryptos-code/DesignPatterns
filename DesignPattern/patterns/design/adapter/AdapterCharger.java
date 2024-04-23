package DesignPattern.patterns.design.adapter;

public class AdapterCharger implements AppleCharger{

    private AndroidCharger charger;

    public AdapterCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void ChargePhone() {
        charger.chargeAndroidPhone();
        System.out.println("Your phone is charging using Adapter");
    }
}
