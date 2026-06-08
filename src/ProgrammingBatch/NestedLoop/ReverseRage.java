package ProgrammingBatch.NestedLoop;

public class ReverseRage {
    public static void main(String[] args){
        int start = 100;
        int end = 200;

       while(start<=end)
       {
           int temp = start;
           int rev = 0;
           while(temp!=0){
               rev = rev *10 +(temp %10);
               temp/=10;
           }
           System.out.println(rev);
           start++;
       }
    }
}
