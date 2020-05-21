//编写步骤：
//        1. 模拟教学管理系统师生信息。
//        2. 定义Person类。
//        1. 属性：姓名、年龄
//        2. 构造方法：无参构造方法，有参构造方法
//        3. 成员方法：getXxx方法，setXxx方法，显示基本信息showMsg方法
//        3. 定义Teacher类，继承Person
//        1. 属性：学科
//        2. 构造方法：无参构造方法，有参构造方法
//        3. 成员方法：getXxx方法，setXxx方法，讲课方法
//        4. 定义Student类，继承Person
//        1. 属性：分数
//        2. 构造方法：无参构造方法，有参构造方法
//        3. 成员方法：getXxx方法，setXxx方法，考试方法
public class Test04 {
    public static void main(String[] args) {
        Teacher t = new Teacher("王小平",35,"java");
        Student s = new Student("李小乐",18,100);
        t.showMsg();
        t.lecture();

        s.showMsg();
        s.exam();
    }
}
