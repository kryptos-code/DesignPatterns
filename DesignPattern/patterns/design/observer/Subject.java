package DesignPattern.patterns.design.observer;

public interface Subject {

    void subscriber(Observer ob);
    void unsubscribe(Observer ob);
    void newVideoUploaded(String title);
}
