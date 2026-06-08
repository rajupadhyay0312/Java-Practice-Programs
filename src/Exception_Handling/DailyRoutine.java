package Exception_Handling;

import java.util.Scanner;

class HelmentNotFoundException extends Exception{
}
class AssignmentNotCompletedException extends RuntimeException{
}
public class DailyRoutine {
    public static void main(String[] args)
    {
        try{
            travelling();
        }catch(HelmentNotFoundException e){
            System.out.println("Exception handled");
        }
        attendBatch(true);
    }
    public static void travelling() throws HelmentNotFoundException
    {
        System.out.println("travelling started");
    }
    public static void attendBatch(boolean assignment)
    {
        if(assignment){
            try{
                checkAssignment();
            }
            catch(AssignmentNotCompletedException e){
                System.out.println("Throw him/her");
            }
        }
        System.out.println("class completed");
    }
    public static void checkAssignment(){
        System.out.print("Enter your response: ");
        String resp = new Scanner(System.in).next().toUpperCase();
        if(resp.equals("YES")){
            System.out.println("CONTINUE YOUR CLASS");
        }
        else{
            throw new AssignmentNotCompletedException();
        }
    }
}
