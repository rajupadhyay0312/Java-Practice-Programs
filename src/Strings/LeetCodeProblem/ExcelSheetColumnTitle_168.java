package Strings.LeetCodeProblem;

public class ExcelSheetColumnTitle_168 {
    public static void main(String[] args) {
        int columNumber = 1;
        System.out.println(convertToTitle(columNumber));
    }
    public static String convertToTitle(int num) {
        String result = "";
        while(num>0){
            num--;
            int rem =num%26;
            char ch = (char)(rem+65);
            result = ch+result;
            num/=26;
        }
        return result;
    }
}
