package DesignPattern.patterns.design.singleton;

import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {

    private static Samosa samosa;

    // constructor
    private Samosa(){

        if(samosa!=null){
            throw new RuntimeException("You are trying to break singleton pattern");
        }
    }

    // static - no object required for calling samosa
    // Lazy way of creating singleton object

    // public synchronized static Samosa getSamosa(){
    public static Samosa getSamosa(){
        // Object of this class
        if(samosa == null) {
            synchronized (Samosa.class){
                if(samosa == null){
                    samosa = new Samosa();
                }
            }
        }

        return samosa;
    }

    public Object readResolve(){
        return samosa;
    }

    public Object clone() throws CloneNotSupportedException{
        return samosa;
    }

    /*
    *   1. constructor should be private (To restrict object creation)
    *
    *   2. object create with the help of method
    *
    *   3. create field to store object is private
    * */
}
