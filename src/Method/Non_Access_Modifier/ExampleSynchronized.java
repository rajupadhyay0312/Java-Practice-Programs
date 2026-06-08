package Method.Non_Access_Modifier;

public class ExampleSynchronized {
    public static void main(String[] args) {
        Task object = new Task();
        //new thread creation
        MyThread thread1 = new MyThread(object);
        thread1.start();
        object.printNumber("Main");

    }
}

class MyThread extends Thread {
    Task object;

    MyThread(Task object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.printNumber("ramesh");
    }
}

class Task {
    public synchronized void printNumber(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " : " + i);
        }
    }
}
