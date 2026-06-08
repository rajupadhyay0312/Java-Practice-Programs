package Collection_FrameWork.Cursor;

import java.util.ArrayList;
import java.util.ListIterator;

class Product implements Cloneable{
    String name;
    String desc;
    double price;

    public Product(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class InventoryManagement{
    ArrayList<Product> list = new ArrayList<Product>();
    {
        list.add(new Product("Marker","camlin white board marker",25));
        list.add(new Product("duster","wooden white board duster",100));
        list.add(new Product("pen","Trimax",5));
        list.add(new Product("Notebook","single line ruled classmate",200));
    }
    public void startApp(){
        ListIterator<Product> li = list.listIterator();
        viewInventory(li);
        System.out.println("_______addProduct________");
        addProduct(li);
        resetIterator(li);
        viewInventory(li);
        System.out.println("______removeProduct_________");
        removeProduct("Notebook",li);
        resetIterator(li);
        viewInventory(li);
        System.out.println("_______UPDATE_______");
        updateProduct("pen",50,li);
        resetIterator(li);
        viewInventory(li);

    }
    public void updateProduct(String name, double price, ListIterator<Product> li) {
        resetIterator(li);
        while(li.hasPrevious()){
            Product ele = li.previous();
            if(ele.name.equals(name)){
                Product p = ele;
                p.price = price;
                li.set(p);
                break;
            }
        }
    }
    public void removeProduct(String name, ListIterator<Product> li){
        resetIterator(li);
        while(li.hasNext()){
            Product ele = li.next();
            if(ele.name.equals(name)){
                li.remove();
            }
        }
    }
    public void resetIterator(ListIterator<Product> li){
        while(li.hasPrevious())
            li.previous();
    }
    public void addProduct(ListIterator<Product> li){
        li.add(new Product("pencil","natraj",10));
        li.add(new Product("pencil","apsara",10));
    }
    public void viewInventory(ListIterator<Product> li){
        while(li.hasNext()){
            System.out.println(li.next());
        }
    }
}
public class ListIteratorDriverExample {
    public static void main(String[] args) {
        InventoryManagement obj = new InventoryManagement();
        obj.startApp();
    }
}
