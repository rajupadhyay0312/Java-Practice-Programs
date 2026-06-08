package Collection_FrameWork;

import java.util.ArrayList;
class UserArrayList<E>{
    private final int INITIAL_CAPACITY = 10;
    private E[] arr;
    private int index;

    public UserArrayList(){
        arr = (E[]) new Object[INITIAL_CAPACITY];
    }
    public int size(){
        return index;
    }
    @Override
    public String toString(){
        if(index==0) return"[]";

        String rep = "[";
        for(int i=0; i<size()-1; i++){
            rep += arr[i]+", ";
        }
        return rep += arr[index-1]+"]";
    }
    public boolean add(E ele){
        if(arr.length==size()){
            E[] newArr = (E[]) new Object[newCapacity(arr.length)];
            for(int i=0; i<arr.length; i++){
                newArr[i] = arr[i];
            }
            this.arr = newArr;
        }
        arr[index++]=ele;
        return true;
    }
    private int newCapacity(int oldCap) {
        return (int)(oldCap*1.5);
    }
    public int capacity(){
        return arr.length;
    }
    public void addLast(E ele){
        add(ele);
    }
    public void addFirst(E ele){
        if(this.arr.length==size()){
            E[] newArr = (E[])new Object[newCapacity(arr.length)];
            for(int i=0; i<arr.length; i++){
                newArr[i]=arr[i];
            }
            this.arr = newArr;
        }
        for(int i=index; i>=1; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=ele;
        index++;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public void ensureCapacity(int newCap){
        if(newCap<=capacity()) return;
        E[] newArr = (E[]) new Object[size()];
        for(int i=0; i<newArr.length; i++){
            newArr[i]=arr[i];
        }
        this.arr=newArr;
    }
    public void trimToSize(){
        if(size()==capacity()) return;
        E[] newArr = (E[]) new Object[size()];
        for(int i=0; i<newArr.length; i++){
            newArr[i] = arr[i];
        }
        this.arr = newArr;
    }
    public int indexOf(E ele) {
        for (int i = 0; i < size(); i++) {
            if (ele == null) {
                if (arr[i] == null) return i;
            } else {
                if (ele.equals(arr[i])) return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(E ele) {
        for (int i = size() - 1; i >= 0; i--) {
            if (ele == null) {
                if (arr[i] == null) return i;
            } else {
                if (ele.equals(arr[i])) return i;
            }
        }
        return -1;
    }
    public E getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        return arr[0];
    }
    public E getLast(){
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        return arr[arr.length-1];
    }
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return arr[index];
    }
    public E set(int index, E ele) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        E oldValue = arr[index];
        arr[index] = ele;

        return oldValue;
    }
}
public class ArrayList_Method_User_Imp {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println(list1);
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println("________________");
        UserArrayList<Integer> list2 = new UserArrayList<Integer>();
        System.out.println(list2);
        list2.add(10);
        list2.add(20);
        System.out.println(list2.capacity());
        list2.ensureCapacity(100);
        System.out.println(list2.capacity());
        System.out.println(list2);
        System.out.println("Index of 20: " + list1.indexOf(20));
        System.out.println("Index of 30: " + list1.indexOf(30));

        System.out.println("Last index of 20: " + list1.lastIndexOf(20));
        System.out.println("Last index of 30: " + list1.lastIndexOf(50));

        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());

        System.out.println(list1.get(0));

        int old = list1.set(1, 99);

        System.out.println("Old value: " + old);
        System.out.println(list1);
    }
}
