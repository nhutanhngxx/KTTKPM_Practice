package vn.com.iuh.fit;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}
