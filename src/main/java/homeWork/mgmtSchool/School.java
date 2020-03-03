package homeWork.mgmtSchool;

import java.util.ArrayList;

public class School {
    public static School instance = new School();
    private ArrayList<String> teachers = new ArrayList<String>();
    private ArrayList<String> classRoom = new ArrayList<String>();

    public ArrayList<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<String> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<String> getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ArrayList<String> classRoom) {
        this.classRoom = classRoom;
    }

    private School () {
    }

    public static School getInstance() {
        if (instance == null) {
            return instance = new School();
        } else {
            return instance;
        }
    }
}
