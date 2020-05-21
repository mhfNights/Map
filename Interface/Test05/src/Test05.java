//编写步骤
//        1. 定义接口Universe，提供抽象方法doAnything。
//        2. 定义普通类Star，提供成员发光shine方法
//        3. 定义普通类Sun，继承Star类，实现Universe接口
//        4. 测试类中，创建Star对象，调用shine方法
//        5. 测试类中，多态的方式创建Sun对象，调用doAnything方法，向下转型，调用shine方法。
public class Test05 {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        Universe u = new Sun();
        u.doAnything();
        Sun sun =(Sun) u;
        sun.shine();
    }
}
