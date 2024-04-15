package DesignPattern.patterns.design;

import DesignPattern.patterns.design.singleton.Samosa;
import DesignPattern.patterns.design.singleton.SamosaEnum;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

        // Singleton Design
 /*       Samosa samosa = Samosa.getSamosa();

        System.out.println(samosa.hashCode());

        Samosa samosa1 = Samosa.getSamosa();

        System.out.println(samosa1.hashCode());*/
        // Singleton Design

        /* Breaking Singleton Pattern */
        /*
        *   1. Reflection API to break singleton pattern
        *   solution: 1-> if Obj is there - throw exception from inside constructor
        *   solution: 2-> using enum in class declaration of Samosa
        *
        *
        *   2. Deserialization
        *   solution: 1-> Implement readResolve method
        *
        *
        *   3. Cloning
        *
        * */

        // Solution 1
/*        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        Constructor<Samosa> constr = Samosa.class.getDeclaredConstructor();
        constr.setAccessible(true);
        Samosa s2 = constr.newInstance();
        System.out.println(s2.hashCode());

        // Enumeration Solution 2
        SamosaEnum s3 = SamosaEnum.INSTANCE;

        System.out.println(s3.hashCode());

        SamosaEnum s4 = SamosaEnum.INSTANCE;
        System.out.println(s4.hashCode());*/


        // Deserialization Example
        /*Samosa samosa = Samosa.getSamosa();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        System.out.println(samosa.hashCode());
        oos.writeObject(samosa);

        System.out.println("Serialization done..");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa samosa2 = (Samosa) ois.readObject();
        System.out.println(samosa2.hashCode());*/

        // Cloning Example
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Samosa samosa1 = (Samosa) samosa.clone();
        System.out.println(samosa1.hashCode());
    }

}
