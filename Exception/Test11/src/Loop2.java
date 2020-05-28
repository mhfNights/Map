public class Loop2 extends Thread{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        String b;
        for (int i = 0; i < 100000; i++) {
            b = "黑马程序员";
        }
        long end = System.currentTimeMillis();
        System.out.println("线程2使用了"+(end-start)+"毫秒");
    }
}
