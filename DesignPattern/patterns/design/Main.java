package DesignPattern.patterns.design;

import DesignPattern.patterns.design.singleton.Samosa;

public class Main {
    public static void main(String[] args) {

        // Singleton Design
        Samosa samosa = Samosa.getSamosa();

        System.out.println(samosa.hashCode());

        Samosa samosa1 = Samosa.getSamosa();

        System.out.println(samosa1.hashCode());
        // Singleton Design


    }

}
