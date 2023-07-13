/**
 * @author klay
 * @date 2023/7/13 15:09
 * @DISCPRIT 实现Runable接口的线程类
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("myThread" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main:" + i);
            Thread.sleep(200);
        }

    }
}
