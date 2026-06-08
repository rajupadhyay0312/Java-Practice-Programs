package ControlFlowStmts.Switch_Statements;

enum Day{
    SUNDAY,MONDAY,TUESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class SwitchExpressionEx1 {
    public static void main(String[] args){
        Day day = Day.MONDAY;
        String result = switch(day){
            case SUNDAY,MONDAY,TUESDAY,THURSDAY,FRIDAY,SATURDAY->"WEEKDAY";
            default->"WEEKEND";
        };
        System.out.println(day+" : "+result);
    }
}
