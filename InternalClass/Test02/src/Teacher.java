public class Teacher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setattendance(Student s,boolean b){
        if (b){
            s.setAttendance(b);
        }else {
            s.setAttendance(b);
        }
    }

    public Teacher(String name){
        this.name = name;
    }
}
