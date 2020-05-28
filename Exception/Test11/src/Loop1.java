public class Loop1 extends Thread{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < 100000; i++) {
           a = i;
        }
        long end = System.currentTimeMillis();
        System.out.println("线程1使用了"+(end-start)+"毫秒");
    }
}
