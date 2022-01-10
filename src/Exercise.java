import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise {
    public static void main(String[] args) {
        int i=0;
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        TestThread testThread = new TestThread("Thread",i);
//        Thread thread1 = new Thread(testThread);
//        Thread thread2 = new Thread(testThread);
//        thread1.setName("线程1");
//        thread2.setName("线程2");
//        thread1.start();
//        thread2.start();

        executorService.execute(testThread);
        executorService.execute(testThread);
        executorService.execute(testThread);
        executorService.execute(testThread);
        executorService.execute(testThread);
        executorService.execute(testThread);
    }
}
