package ControlFlowStmts.LoopingStatement.Label;

public class LabelExample {
    public static void main(String[] args){
        System.out.println("exe starts main ");
        myBlock:{
            System.out.println("MyBlock exe starts");
            if(false){
                System.out.println("HELLO JAVA ");
            }
            else{
                System.out.println("Stop the exe of MyBlock and cont after it ");
                break myBlock;
            }
            System.out.println("MyBlock exe ends");
        }
        System.out.println("exe ends main");
    }
}
