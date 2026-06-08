package Exception_Handling;

//Example  : - StringIndexOutBoundException
public class UncheckedExample1 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstwxyz";
        for(int i=0; ;i++){
            char ch=' ';
            try{
                ch = str.charAt(i);

            }catch(StringIndexOutOfBoundsException e){
                break;
            }
            System.out.print(ch+" ");
        }
    }
}
