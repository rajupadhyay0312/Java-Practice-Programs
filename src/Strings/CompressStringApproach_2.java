package Strings;

public class CompressStringApproach_2 {
    public static void main(String[] args) {
        String str = "aabbbbccaacccddd";
        compressor(str);
    }
    public static void compressor(String str){
        String comp = "";
        int cnt = 1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                cnt++;
            }else{
                comp+=str.charAt(i);
                comp+=cnt;
                cnt=1;
            }
        }
        comp+=str.charAt(str.length()-1);
        comp+=cnt;
        System.out.println(comp);
    }
}
