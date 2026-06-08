package Strings;

public class Check_If_The_String_is_Panagram {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        if(checkPanagram(str)){
            System.out.println("Panagram");
        }else{
            System.out.println("Not Panagram");
        }
    }
    public static boolean checkPanagram(String str){
        outerLoop:
        for(char ch ='a';ch<='z'; ch++){
            for(int ele : str.toCharArray()){
                if(ele==ch) continue outerLoop;
            }
            return false;
        }
        return true;
    }
}
