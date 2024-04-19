package DesignPattern.patterns.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String impData;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getImpData() {
        return impData;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }

    public void loadImpData() throws InterruptedException {
        this.impData = "very very important time";
        // It is taking 5 minutes

        this.domains.add("www.hello.com");
        this.domains.add("www.world.com");
        this.domains.add("www.india.com");



        Thread.sleep(2000);
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", impData='" + impData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    public NetworkConnection clone() {
        try {
            //NetworkConnection clone = (NetworkConnection) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original

            // Logic for Deep Cloning
            NetworkConnection networkConnection = new NetworkConnection();

            networkConnection.setIp(this.ip);
            networkConnection.setImpData(this.impData);

            for(String temp: this.domains){
                networkConnection.getDomains().add(temp);
            }

            return networkConnection;
        } catch (Exception e) {
            throw new AssertionError();
        }
    }
}
