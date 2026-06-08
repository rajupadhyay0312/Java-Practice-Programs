package Strings;

public class FindLargestConsecutiveNonRepeatingSubsequence {
    public static void main(String[] args) {
        String str = "abcdefghuiabcdeabcdefguh";
        int max = 0;
        String largest = "";

        for(int i=0; i<str.length(); i++){
            String str1 = str.charAt(i)+"";
            for(int j=i+1; j<str.length();j++){
                str1+=str.charAt(j);
                if(isUnique(str1)){
                    if(max<str1.length()){
                        max=str1.length();
                        largest=str1;
                    }
                }
            }
        }
        System.out.println(largest);
    }
    public static boolean isUnique(String str){
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]) return false;
            }
        }
        return true;
    }
}
