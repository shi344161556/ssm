import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDome1 {

    public static void main(String[] args) {
        Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0 ;i<10; i++) {
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        });

       Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                /*try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                for (int i = 10; i <20; i++){
                    System.out.println(Thread.currentThread().getName()+" "+ i);
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
               /* try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                for (int i = 20; i <30; i++){
                    System.out.println(Thread.currentThread().getName()+" "+ i);
                }
            }
        });

        /*t1.start();
        t2.start();
        t3.start();*/
        //ExecutorService executorService = Executors.newCachedThreadPool();
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);

        executorService.shutdown();

        /*final Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " run 1");
            }
        }, "T1");
        final Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " run 2");
            }
        }, "T2");
        final Thread t3 = new Thread(new Runnable() {
            public void run() {
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " run 3");
            }
        }, "T3");
        // method1  第一反应的解决方法，事实证明不可靠
        t1.start();
        t2.start();
        t3.start();*/
    }
}
