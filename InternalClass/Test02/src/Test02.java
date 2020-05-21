import java.util.ArrayList;

//* 模拟上课出勤情况。
//        - 定义学生类：
//        - 属性：姓名，出勤。
//        - 提供基本的构造方法和get方法，set方法。
//        - 定义讲师类：
//        - 属性：姓名。
//        - 提供基本的构造方法和get方法，set方法
//        - 成员方法：点名方法，设置每一位的学生出勤情况。假设，小明今日未出勤。
//        - 定义课程类：
//        - 属性：课程名称，讲师，学生集合。
//        - 提供基本的构造方法和get方法，set方法
//        - 成员方法：show方法，打印课程信息，老师姓名，学生是否上课情况
public class Test02 {
    public static void main(String[] args) {
        Student s1 = new Student("小1");
        Student s2 = new Student("小2");
        Student s3 = new Student("小3");
        Student s4 = new Student("小4");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Teacher t =new Teacher("张老师");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals("小3")){
                t.setattendance(list.get(i),false);
            }else {
                t.setattendance(list.get(i),true);
            }
        }
        Course c = new Course(t,"Java",list);
        c.show();
    }
}
