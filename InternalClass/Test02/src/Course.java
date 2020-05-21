import java.util.ArrayList;

public class Course {
    private Teacher t;
    private  String courseName;
    private ArrayList<Student> s;

    public void show(){
        System.out.println("课程信息："+courseName);
        System.out.println("上课老师："+t.getName());
        for (int i = 0; i <s.size() ; i++) {
            Student s1= s.get(i);
            if (s1.isAttendance()){
                System.out.println(s1.getName()+"上课");
            }else {
                System.out.println(s1.getName()+"旷课");
            }

        }
    }

    public Course(Teacher t,String courseName,ArrayList<Student> s){
        this.courseName = courseName;
        this.t = t;
        this.s = s;
    }
}
