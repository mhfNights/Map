import java.util.Collections;
import java.util.HashSet;

//六、定义人类，包含姓名和年龄属性。
//        创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储
public class Test06 {
    public static void main(String[] args) {
        HashSet<Person> personSet = new HashSet();
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",19);
        Person p3 = new Person("王五",20);
        Person p4 = new Person("赵六",21);
        Collections.addAll(personSet,p1,p2,p3,p4);
        System.out.println(personSet);
    }
}
