//编写步骤：
//        1. 定义接口A，普通类B实现接口A。
//        2. A接口中，定义抽象方法showA。
//        3. A接口中，定义私有方法show10（String str），循环打印10次str。
//        4. A接口中，定义默认方法showB10，showC10，分别调用show10方法，传入参数。
//        5. 测试类中，创建B对象，调用showA方法，showB10方法，showC10方法
public class Test03 {
    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB10("java");
        b.showC10("language");
    }
}
