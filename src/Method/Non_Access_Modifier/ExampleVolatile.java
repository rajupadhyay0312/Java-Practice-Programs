package Method.Non_Access_Modifier;

public class ExampleVolatile {
    public static void main(String[] args) throws InterruptedException{
      PerformTask object = new PerformTask();
      OurThread t1 = new OurThread(object);
      OurThread t2 = new OurThread(object);
      System.out.println("before : "+object.getCounter());

      t1.start();
      t2.start();

      t1.join();
      t2.join();
      System.out.println("after : "+object.getCounter());
    }
}
class OurThread extends Thread{
   PerformTask object;

   OurThread(PerformTask object){
       this.object = object;
   }
   public void run(){
       for(int i=1; i<=1000; i++){
           object.setCounter();
       }
   }
}
class PerformTask{
    private volatile int counter = 0; // volatile always declared in global variable

    public int getCounter(){
        return counter;
    }
    public void setCounter(){
        counter++;
    }
}
