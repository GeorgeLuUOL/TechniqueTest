import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread implements Runnable {
    public static final ThreadLocal theThreadLocal = new ThreadLocal();
    String name;
    Integer num;
    Lock lock = new ReentrantLock();
    public TestThread(String name, int num){
        this.name=name;
        this.num=num;
    }
    @Override
    public void run() {

            for (int j = 0; j < 1000; j++) {

                try {
                    Thread.sleep(1000);
                    synchronized (num){
                    System.out.println(++num + name + "当前线程是" + Thread.currentThread());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                }
            }


    }


}
