package Strings;

public class ReplaceVowelWithSpecificSymbol {
    public static void main(String[] args) {
        String str = "java is easy";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.print('*');
            }else{
                System.out.print(ch+"");
            }
        }
    }
}
