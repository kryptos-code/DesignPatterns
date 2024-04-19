package DesignPattern.patterns.design.prototype;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using prototype design");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.0.0.4");
        networkConnection.loadImpData();

        System.out.println(networkConnection);

        NetworkConnection nC2 = networkConnection.clone();
        System.out.println(nC2);

        NetworkConnection nC3 = networkConnection.clone();
        System.out.println(nC3);

        // Example of Shallow Copying :: adding one more value in list
        networkConnection.getDomains().add("www.kryptos.com");
        System.out.println(networkConnection);
        System.out.println(nC2);
        System.out.println(nC3);
    }
}
