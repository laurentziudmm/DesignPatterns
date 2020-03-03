package homeWork.mgmtSchool;

public class ClassRoom {

    private String student;
    private String teacher;
    private String catalog;
    private String schedule;

    public ClassRoom(String student, String teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ClassRoom copy() {
        return new ClassRoom(this.student,this.teacher);
    }

}
