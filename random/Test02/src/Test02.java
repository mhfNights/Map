import java.util.ArrayList;
import java.util.Scanner;

//键盘录入学生信息，保存到集合中。
//
//        * 循环录入的方式，1：表示继续录入，0：表示结束录入。
//        * 定义学生类，属性为姓名，年龄，使用学生对象保存录入数据。
//        * 使用ArrayList集合，保存学生对象，录入结束后，遍历集合。
public class Test02 {
    public static void main(String[] args) {
        ArrayList<Student> stu=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("1.录入信息 2.结束录入");
            int s= sc.nextInt();
            switch (s){
                case 1:
                    inputStudent(stu);
                    break;
                case 2:
                    System.out.println("录入结束");
            }
            if (s==2){
                break;
            }
        }
        for (int i= 0; i<stu.size();i++){
            Student stus=stu.get(i);
            stus.show();
        }

    }
    public static void inputStudent(ArrayList<Student> stu){
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入学1生姓名：");
        String name= sc.next();
        System.out.println("请输入学生年龄：");
        int age=sc.nextInt();
        Student student= new Student(name,age);
        stu.add(student);
    }

}
