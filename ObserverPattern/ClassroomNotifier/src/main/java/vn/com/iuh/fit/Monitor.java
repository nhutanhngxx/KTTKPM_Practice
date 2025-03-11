package vn.com.iuh.fit;

import java.util.ArrayList;
import java.util.List;

/**
 * Monitor (Lớp trưởng)
 */

public class Monitor implements Subject {

    private List<Observer> students = new ArrayList<>();
    private String message;

    public void setNotification(String message) {
        this.message = message;
        notifyObservers();
    }

    @Override
    public void attach(Observer o) {
        students.add(o);
    }

    @Override
    public void detach(Observer o) {
        students.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : students) {
            o.update(message);
        }
    }
}
