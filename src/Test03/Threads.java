package Test03;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("Это из майн");

    }
}

class Runner implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 100; i ++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Привет мой поток " + i);

        }
    }
}


class MyThread extends Thread {

    public void run(){
        for(int i = 0; i < 1000; i ++){
            System.out.println("Привет мой поток " + i);

        }
    }

}
