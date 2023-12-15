public class MultiThreadApp{
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++){
            MyThread myThread = new MyThread();
            myThread.start();
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run(){
        Thread t = Thread.currentThread();
        System.out.println("Thread " + t.getId() + " is running");
    }
}
