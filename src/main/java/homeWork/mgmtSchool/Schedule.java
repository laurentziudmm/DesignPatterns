package homeWork.mgmtSchool;

import java.util.ArrayList;

public class Schedule {

    public static Schedule instance = new Schedule();
    private ArrayList<String> days = new ArrayList<String>();
    private ArrayList<String> hours = new ArrayList<String>();

    public ArrayList<String> getDays() {
        return days;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }

    public ArrayList<String> getHours() {
        return hours;
    }

    public void setHours(ArrayList<String> hours) {
        this.hours = hours;
    }

    private Schedule() {
    }

    public static Schedule getInstance() {
        if (instance == null) {
            return instance = new Schedule();
        } else {
            return instance;
        }
    }
}
