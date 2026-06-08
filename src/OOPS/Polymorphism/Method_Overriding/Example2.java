package OOPS.Polymorphism.Method_Overriding;

import java.util.ArrayList;

class UserCollection {

    int[] arr = new int[10];
    int index;

    public int remove(int ele) {
        int searchIndex = 0;
        for (int i = 0; i < index; i++) {
            if(ele == arr[i]){
                searchIndex = i;
                break;
            }
        }
        for(int i = searchIndex; i<index-1; i++){
            arr[i] = arr[i+1];
        }
        arr[index-1] = 0;
        index--;
        return ele;
    }
}
class UserList extends UserCollection{

}
class UserArrayList extends UserList{
    public void add(int ele){
        arr[index] = ele;
        index++;
    }
    @Override
    public String toString(){
        if(index==0) return"[";
        String op = "[";
        for(int i=0; i<index-1;i++){
            op+=arr[i]+",";
        }
        return op+arr[index-1]+"]";
    }
    public int size(){
        return index;
    }
    public int remove(int index){
        for(int i=index; i<this.index-1; i++){
            arr[i] = arr[i+1];
        }
        arr[this.index-1]=0;
        this.index--;
        return arr[index];
    }
}
public class Example2 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1.toString());

        UserArrayList list2 = new UserArrayList();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        System.out.println(list2.toString());
        list2.remove(3);
        System.out.println(list2.toString());
    }
}
