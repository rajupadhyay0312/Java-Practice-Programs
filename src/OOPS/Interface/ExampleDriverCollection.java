package OOPS.Interface;

interface Iterable{
    void forEach();
}
interface Collection extends Iterable{
    void add(int ele);
    void remove(int index);
    void isEmpty();
}
interface List extends Collection{ }
abstract class ArrayList implements List{ }
abstract class Vector implements List{}
abstract class Stack extends Vector{}

interface Queue extends Collection{
    void offer();
    void pull();
}
class PriorityQueue implements Queue{
    @Override
    public void offer(){
        System.out.println("offer() impl from PriorityQueue");
    }
    @Override
    public void pull(){
        System.out.println("pull() impl from PriorityQueue");
    }
    @Override
    public void add(int ele) {
        System.out.println("add(int ele) impl from PriorityQueue");
    }
    @Override
    public void remove(int index) {
        System.out.println("remove(int index) impl from PriorityQueue");
    }
    @Override
    public void isEmpty() {
        System.out.println("isEmpty() impl from PriorityQueue");
    }
    @Override
    public void forEach() {
        System.out.println("forEach() impl from PriorityQueue");
    }
}
interface Dequeu extends Queue{ }

class LinkedList implements List,Dequeu{
    @Override
    public void offer() {
        System.out.println("offer() impl from LinkedList");
    }
    @Override
    public void pull() {
        System.out.println("pull() impl from LinkedList");
    }
    @Override
    public void add(int ele) {
        System.out.println("add(int ele) impl from LinkedList");
    }
    @Override
    public void remove(int index) {
        System.out.println("remove(int index) impl from LinkedList");
    }
    @Override
    public void isEmpty() {
        System.out.println("isEmpty() impl from LinkedList");
    }
    @Override
    public void forEach() {
        System.out.println("forEach() impl from LinkedList");
    }
}
public class ExampleDriverCollection {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.pull();
        obj.offer();
        obj.add(23);
        obj.remove(2);
        obj.forEach();
        obj.isEmpty();

        System.out.println("__________________________________________");

        PriorityQueue obj1 = new PriorityQueue();
        obj1.add(12);
        obj1.forEach();
        obj1.isEmpty();
        obj1.offer();
        obj1.remove(3);
        obj1.pull();
    }
}
