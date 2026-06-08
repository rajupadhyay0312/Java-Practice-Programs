package Strings;

public class Count_UpperCase_LowerCase_Character {
    public static void main(String[] args) {
        String str =  "AbCDeFgHiJklM";
        countUpperLowerCaseChar(str);
    }
    public static void countUpperLowerCaseChar(String str){
        int upper=0;
        int lower=0;
        for(int i=0;i<str.length(); i++){
            char ch  = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper++;
            }else{
                lower++;
            }
        }
        System.out.println("UpperCase count:- "+upper);
        System.out.println("LowerCase count:- "+lower);
    }
}
