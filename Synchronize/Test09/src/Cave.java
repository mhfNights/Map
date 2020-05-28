import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cave  implements Runnable{


    int num = 0;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num++;
            System.out.println("已通过了"+num+"个人,"+"通过的人是"+Thread.currentThread().getName());
            lock.unlock();

    }
}
