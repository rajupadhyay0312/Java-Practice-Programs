package Strings;

public class AllPossiblePermutation {
    public static void main(String[] args) {
        String str = "abcd";
        createPermutation(str.toCharArray(),0);
    }
    public static void createPermutation(char[] ch, int ref){
        if(ref == ch.length-1){
            System.out.println(new String(ch));
            return;
        }
        for(int i=ref; i<ch.length; i++){
            swap(ch,i,ref);
            createPermutation(ch,ref+1);
            swap(ch,ref,i);
        }
    }
    public static void swap(char[] ch, int i, int j){
              char temp = ch[i];
              ch[i]=ch[j];
              ch[j]=temp;
    }
}
