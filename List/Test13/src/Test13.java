import java.util.*;

//十三、分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，
//        如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序
public class Test13 {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        Student s1 = new Student("liusan",20,90.0F);
        Student s2 = new Student("lisi",22,90.0F);
        Student s3 = new Student("wangwu",20,99.0F);
        Student s4 = new Student("sunliu",22,100.0F);
        Collections.addAll(student,s1,s2,s3,s4);
        System.out.println(student);
        Collections.sort(student);
        System.out.println(student);
        ArrayList<Student> students = new ArrayList<>();
        Collections.addAll(students,s1,s2,s3,s4);
        System.out.println(students);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getFraction() > o2.getFraction()){
                    return -1;
                }else if (o1.getFraction() < o1.getFraction()){
                    return 1;
                }else if (o1.getAge() > o2.getAge()){
                    return 1;
                }else if (o1.getAge() < o2.getAge()){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(students);

    }
}
