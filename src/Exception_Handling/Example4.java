package Exception_Handling;

//public class Example4 {
//    public static void main(String[] args) {
//        System.out.println("exe start");
//        try{
//            System.out.println("try");
//            System.out.println(10/0);
//        }
//        catch(InterruptedException e){
//            System.out.println("catch");
//        }
//        System.out.println("exe ends");
//    }
//}
/*
*CTE: exception InterruptedException is never thrown in body of corresponding try statement catch (InterruptedException e) {
* Meaning : - Java is saying:

* Java is Saying that : -
“I looked inside your try block, and there is no statement there that can throw InterruptedException.
*  So this catch block can never run.”
* */