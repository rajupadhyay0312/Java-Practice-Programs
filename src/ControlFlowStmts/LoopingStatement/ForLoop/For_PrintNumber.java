//Write a java program to print number from  1 to 5...

package ControlFlowStmts.LoopingStatement.ForLoop;

public class For_PrintNumber {
    public static void main(String[] args){

        int i = 0;
        for(; i <= 5; i++) {
            System.out.println("Inner loop");
            System.out.println("i : " + i);
        }
       // System.out.println("i : " + i);
    }
}
