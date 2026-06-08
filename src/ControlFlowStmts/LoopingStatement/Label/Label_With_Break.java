package ControlFlowStmts.LoopingStatement.Label;

public class Label_With_Break {
    public static void main(String[] args){

        outerLoop:
        for(int i=1; i<=3; i++){
            System.out.println("Outer Loop i :" +i);

            for(int j = 1; j<=3; j++){
                System.out.println("Inner Loop j :"+j);
                if(i==2 && j==2)
                    break outerLoop;
            }
        }
    }
}
