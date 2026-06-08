package Strings.LeetCodeProblem;

public class NumberOfSegmentInTheString_434 {
    public static void main(String[] args) {
        String str = "Hello, My Name is Ramesh";
        System.out.println(countSegment(str));
    }
    public static int countSegment(String str){
       String[] arr = str.split(" ");
       int cnt = 0;
       for(String word : arr){
           if(word.length()>0){
               cnt++;
           }
       }
       return cnt;
    }
}
