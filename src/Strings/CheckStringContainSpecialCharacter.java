package Strings;

public class CheckStringContainSpecialCharacter {
    public static void main(String[] args){
        String str = "Java134";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0'&&ch<='9')){
                System.out.println("contain special character ");
                return;
            }
        }
        System.out.println("not contain special character");
    }
}
