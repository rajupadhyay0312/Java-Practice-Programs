package Constructor.No_Argument_Constructor;

class Book{
    String name;
    String author;
    String publication;
    double price;
    final long ISBN;
    static long series = 1401601490;

    Book(){
        super();
        for(; ;){
            if(checkISBN(series)){
                series++;
                break;
            }
            series++;
        }
        ISBN = series;
    }
    public boolean checkISBN(long num){
        long sum = 0;
        if((num+"").length()!=10){
            return false;
        }
        for(long i = num, pos=10; i!=0; i/=10, pos--)
            sum += ((i%10)*pos);

        return sum%11 == 0;

    }
    public void displayBook(){
        System.out.println("***** BOOK DETAILS ****");
        System.out.println("Name :"+name);
        System.out.println("Author : "+author);
        System.out.println("Publication :"+publication);
        System.out.println("Price: "+price+"rs");
        System.out.println("ISBN : "+ISBN);
    }
}
public class ExampleBook {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.name = "Murtuyanjaye";
        book1.author = "Shivaji Savant";
        book1.publication = "Writer Workshop";
        book1.price = 557;
        book1.displayBook();
    }
}
