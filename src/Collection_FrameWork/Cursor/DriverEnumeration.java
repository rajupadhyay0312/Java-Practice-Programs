package Collection_FrameWork.Cursor;

class UserNoSuchElementException extends  RuntimeException{
    UserNoSuchElementException(){
        super();
    }
}
interface UserEnumeration<E>{
    public abstract boolean hasMoreElements();
    public abstract E nextElement();
}
class MyVector<E>{
    private E [] arr;
    private int index;
    private final int INITIAL_CAPACITY = 10;

    MyVector(){
        arr = (E[]) new Object[INITIAL_CAPACITY];
    }
    @Override
    public String toString(){
        if(this.size() == 0) return "[]";
        String op = "[";
        for(int i=0; i<this.size(); i++){
            op+=this.arr[i]+", ";
        }
        op+=this.arr[this.size()-1]+"]";
        return op;
    }
    public int size(){
        return this.index;
    }
    public synchronized void addElement(E item){
        if(this.size() == this.arr.length){
            E[] newArr = (E[]) new Object[(this.arr.length*2)];
            for(int i=0; i<this.size(); i++){
                newArr[i] = this.arr[i];
            }
            this.arr = newArr;
        }
        this.arr[this.index++] = item;
    }
    public E elementAt(int index){
        if(index<0 || index>=this.size())
            throw new UserNoSuchElementException();
        return this.arr[index];
    }
    public UserEnumeration<E> element(){
        return new ImplementsUserVector();
    }
    private class ImplementsUserVector implements UserEnumeration{
        private int cursor;

        @Override
        public boolean hasMoreElements(){
            return cursor<size();
        }
        @Override
        public E nextElement(){
            return elementAt(cursor++);
        }
    }
}
public class DriverEnumeration {
    public static void main(String[] args) {
        MyVector<Integer> list = new MyVector<Integer>();
        list.addElement(10);
        list.addElement(20);
        list.addElement(30);
        list.addElement(40);
        list.addElement(50);
        System.out.println(list);

        UserEnumeration<Integer> cursor = list.element();
        while(cursor.hasMoreElements()){
            System.out.println(cursor.nextElement());
        }
    }
}
