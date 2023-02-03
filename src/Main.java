public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setName("first  thread");
        myThread.start();
        //myThread.join();
        MyThread myThread1 = new MyThread();
        myThread1.setName("second thread");
        myThread1.start();
    }
}