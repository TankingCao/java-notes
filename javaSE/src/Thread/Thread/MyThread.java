package javaSE.src.Thread.Thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("线程开始执行----------");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println("线程执行结束----------");
    }

    @Override
    public synchronized void start() {
        super.start();
    }
}


