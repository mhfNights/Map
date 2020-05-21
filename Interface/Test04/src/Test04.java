//* 编写步骤
//        1. 定义接口A，普通类B实现接口A。
//        2. A接口中，定义抽象方法showA。
//        3. A接口中，定义私有静态方法show10（String str），循环打印10次str。
//        4. A接口中，定义静态方法showB10，showC10，分别调用show10方法，传入参数。
//        5. B类中，定义静态方法showD
//        6. 测试类中，使用A接口，调用静态showB10方法，showC10方法，
//        7. 测试类中，使用B类，调用showA方法，showD方法
public class Test04 {
    public static void main(String[] args) {
        B b = new B();
        A.showB10("JAVA");
        A.showC10("language");
        b.showA();
        b.showD();
    }
}
