//请使用代码实现
//        每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
//        如果老师给学生赋值一个负数,抛出一个自定异常

public class Test08 {
    public static void main(String[] args) {
        Student s = new Student(1,"张三");
        Teacher t = new Teacher();
        try {
            t.setStudent(s,-2);
            System.out.println("输入完成");
            System.out.println(s);
        } catch (FractionException e) {
            e.printStackTrace();
        }

    }
}
