package Test01;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        myThread.join(); // Ожидание выполнения потока, если закомментировать, тогда сначала выполнится
                        // следующая комманда, а потом поток

        System.out.println("Метод майн");

    }
}
class MyThread extends Thread {
    public void run(){
        for(int i = 0; i < 1000; i ++){
            System.out.println("Привет мой поток");
        }
    }
}
