package DesignPattern.patterns.design.singleton;

public class Samosa {

    private static Samosa samosa;

    // constructor
    private Samosa(){}

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

    /*
    *   1. constructor should be private (To restrict object creation)
    *
    *   2. object create with the help of method
    *
    *   3. create field to store object is private
    * */
}
