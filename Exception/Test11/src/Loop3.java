public class Loop3 extends Thread{
    String c;
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            c = "黑马程序员"+i;
        }
        long end = System.currentTimeMillis();
        System.out.println("线程3使用了"+(end-start)+"毫秒");
    }
}
