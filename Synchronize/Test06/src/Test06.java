//编写程序，在主线程中，循环输出“主线程执行”；在一条新线程中，循环输出“子线
//        程执行
public class Test06 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("子线程执行");
                }
            }
        }).start();
        while (true){
            System.out.println("主线程执行");
        }
    }
}
