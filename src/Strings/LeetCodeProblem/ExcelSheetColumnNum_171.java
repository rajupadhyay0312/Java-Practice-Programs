package Strings.LeetCodeProblem;

public class ExcelSheetColumnNum_171 {
    public static void main(String[] args) {
        String columnTitle = "AA";
        System.out.println(colTitleToNumber(columnTitle));
    }
    public static int colTitleToNumber(String str){
        int num = 0;
        for(int i=0; i<str.length(); i++){
           num  = num*26+(str.charAt(i)-64);
        }
        return num;
    }
}
