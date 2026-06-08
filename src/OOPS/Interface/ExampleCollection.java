package OOPS.Interface;

import java.util.PriorityQueue;

interface UserCollection{
    void display();
    void add(int ele);
    int remove();
}
interface UserList extends UserCollection{

}
class UserStack implements UserList{
    private int[] arr; // Initialize the int[] arr
    int index = 0;
    public UserStack(){
        arr = new int[10]; // Here we have created the 10 size of array inside the UserStack
    }
    @Override
    public void display(){
        if(index == 0){
            System.out.println("[]"); // if there is no element in the array
        }else{
            String op = "[";
            int i=0;
            for(;i<index-1; i++){
                op+=arr[i]+" , ";
            }
            op+=arr[i]+"]";
            System.out.println(op);
        }
    }
    @Override
    public void add(int ele){
        arr[index]=ele; // Add the element to each index
        index++; // increment index
    }
    public int remove(){
        int temp = arr[index-1];
        arr[index-1]=0;
        index--;
        return temp;
    }
}
interface UserQueue extends UserCollection{

}
class UserPriorityQueue implements UserQueue{
    private int[] arr;
    int index = 0;
    public UserPriorityQueue(){
        arr = new int[10];
    }
    @Override
    public void display(){
        if(index == 0){
            System.out.println("[]");
        }else{
            String op ="[";
            int i = 0;
            for(;i<index-1; i++){
                op+=arr[i]+" , ";
            }
            op+=arr[i]+"]";
            System.out.println(op);
        }
    }
    @Override
    public void add(int ele){
        arr[index]=ele;
        index++;
    }
    @Override
    public int remove(){
        int temp = arr[0];
       for(int i=1; i<index; i++){
           arr[i-1]=arr[i];
       }
       arr[index-1]=0;
       index--;
       return temp;
    }

}
public class ExampleCollection {
    public static void main(String[] args) {
        UserStack obj = new UserStack();
        obj.display();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.display();
        System.out.println(obj.remove());
        System.out.println(obj.remove());
        obj.display();

        System.out.println("___________________________________");

        UserPriorityQueue pq = new UserPriorityQueue();
        pq.display();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.display();
        System.out.println(pq.remove());
        pq.display();

        PriorityQueue obj1 = new PriorityQueue();
        obj1.add(10);
        obj1.add(20);
        obj1.add(30);
        obj1.add(40);
        System.out.println(obj1);
        System.out.println(obj1.remove());
        System.out.println(obj1.remove());
        System.out.println(obj1);




    }
}
