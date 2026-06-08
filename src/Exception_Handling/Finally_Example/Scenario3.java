package Exception_Handling.Finally_Example;

class Task{
    public void printNumber(String threadName){
        for(int i=1; i<=10; i++){
            System.out.println(threadName+" : "+i);
            try{
                System.out.println("try ramesh :"+i);
                Thread.sleep(120);
            }
            catch(Exception e){
            }
            finally{
                System.out.println("finally from ramesh "+i);
            }
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        Task task = new Task();
        task.printNumber("ramesh");
    }
}
public class Scenario3 {
    public static void main(String[] args) throws InterruptedException {
         MyThread t1 = new MyThread();
         t1.setDaemon(true);
         t1.start();

         for(int i=1; i<=10; i++){
             Thread.sleep(80);
             System.out.println("main :"+i);
         }
    }
}
