package Constructor;

public class ISBN {
    public static void main(String[] args){
        long num = 8175257660L, sum = 0;

        if((num+"").length()!=10){
            System.out.println("INVALID NUMBER || NOT ISBN NUMBER");
            return;
        }
        for(long i = num, pos=10; i!=0; i/=10,pos--)
            sum += ((i%10)*pos);

        System.out.println(sum%11==0 ? num+" ISBN":num+ " NOT ISBN");
    }
}
