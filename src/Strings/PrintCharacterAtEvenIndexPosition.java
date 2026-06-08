package Strings;

public class PrintCharacterAtEvenIndexPosition{
    public static void main(String[] args) {
        String str ="programming";
        System.out.println(str);

        for(int i=0;i<str.length(); i++){
            char ch = str.charAt(i);
            if(i%2==0){
                System.out.print(ch+" ");
            }
        }
    }
}
