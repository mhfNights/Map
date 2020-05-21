//- 模拟工人挑苹果。
//
//        - 定义苹果类：
//
//        - 属性：大小，颜色。
//        - 提供基本的构造方法和get方法，set方法
//
//        - 定义接口CompareAble：
//
//        - 定义默认方法compare，挑选较大苹果。
//
//        - 定义接口实现类Compare。
//
//        - 定义工人类：
//
//        - 成员方法：挑选苹果Apple pickApple（CompareAble，Apple a1，Apple a2）。
//
//        - 测试类：
//
//        - 创建Worker对象。
//        - 创建两个Apple对象，一个Apple（5，"青色"）,一个Apple（3，"红色"）
//        - 默认挑选大的苹果，打印苹果信息。
//        - 指定颜色挑选，通过匿名内部类实现
public class Test04 {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Apple a1 = new Apple(5,"青色");
        Apple a2 = new Apple(3,"红色");

        Apple big = worker.pickApple(new Compare(),a1,a2);
        System.out.println(big.getColor()+"的苹果比较大,大小是"+big.getSize());
        System.out.println("挑红的：");
        Apple a3 = worker.pickApple(new Compare(){
            @Override
            public Apple comPare(Apple a1, Apple a2) {
                return "红色".equals(a1.getColor())?a1:a2;
            }
        },a1,a2);
        System.out.println(a3);
    }
}
