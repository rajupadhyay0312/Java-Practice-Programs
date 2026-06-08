package Strings;

public class CompressString {
    public static void main(String[] args) {
        String str = "aabbbbccaccdabbaca";
        compressStr(str);
    }
    public static void compressStr(String str){
        String comp =str.charAt(0)+ "";
        int cnt=1;
        for(int i=1; i<str.length();i++){
            char ch = str.charAt(i);
            if(comp.charAt(comp.length()-1)==ch){
               cnt++;
            }else{
                comp+=cnt;
                cnt=1;//reset counter
                comp+=ch;
            }
        }
        comp+=cnt;
        System.out.println(comp);
    }
}
