package Test02;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        /*
        потоки не синхронизированы, данные печатаются хаотично, переменная берется из кеш и затирается.
         */

    }
}

class MyThread extends Thread {

    public void run(){
        for(int i = 0; i < 1000; i ++){
            System.out.println("Привет мой поток " + i);

        }
    }

}
