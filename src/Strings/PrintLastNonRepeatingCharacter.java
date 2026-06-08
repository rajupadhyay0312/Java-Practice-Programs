package Strings;

public class PrintLastNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println(str);
        lastNonRepeatingCharacter(str);
    }
    public static void lastNonRepeatingCharacter(String str){
        for(int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println("Last non repeating character: " + ch);
                break;
            }
        }
    }
}
