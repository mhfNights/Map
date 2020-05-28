//请编写程序，分别打印主线程的名称和子线程的名称。
//        要求使用两种方式实现：
//        第一种方式：继承Thread类。
//        第二种方法：实现Runnable接口
public class Test03 {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread(new Thread2()).start();
        System.out.println(Thread.currentThread().getName());
    }
}
