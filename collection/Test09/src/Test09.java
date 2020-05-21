//定义一个学生类Student，包含三个属性姓名、年龄、性别，
//        创建三个学生对象存入ArrayList集合中。
//        A：遍历集合遍历输出。
//        B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇

import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", "男", 18);
        Student s2 = new Student("李四", "男", 29);
        Student s3 = new Student("小红", "女", 21);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int ageMax = 0;
        int index = 0;
        int i = 0;
        for (Student s : list) {
            index++;
            System.out.println("姓名：" + s.getName() + " 性别：" + s.getSex()
                    + " 年龄：" + s.getAge());
            if (s.getAge() > ageMax) {
                ageMax = s.getAge();
                i = index - 1;
            }
        }
        System.out.println("年龄最大的学生为：" + list.get(i).getName());
        list.get(i).setName("小猪佩奇");
        for (Student s : list) {
            System.out.println("姓名：" + s.getName() + " 性别：" + s.getSex()
                    + " 年龄：" + s.getAge());

        }
    }
}