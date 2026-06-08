package Collection_FrameWork;

import java.util.*;

class UserNoSuchElementException extends RuntimeException {
    public UserNoSuchElementException() {
        this("");
    }
    public UserNoSuchElementException(String desc){
        super(desc);
    }
}
class UserIndexOutOfBoundException extends RuntimeException{
    UserIndexOutOfBoundException(String desc){
        super(desc);
    }
}
class UserLinkedList<E> {
    private int index;
    private Node<E> head;
    private Node<E> tail;

    private class Node<E> {
        Node<E> next;
        E ele;

        Node(E ele) {
            this.ele = ele;
        }
    }
    public int size() {
        return this.index;
    }
    @Override
    public String toString() {
        if (this.size() == 0)
            return "[]";
        String rep = "[";
        Node<E> currNode = this.head;
        while (currNode.next != null) {
            rep += currNode.ele + ",";
            currNode = currNode.next;
        }
        rep += currNode.ele + "]";
        return rep;
    }

    public void addFirst(E ele) {
        Node<E> newNode = new Node<E>(ele);
        if (this.size() == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.index++;
    }

    public E getFirst() {
        if (this.size() == 0) {
            throw new UserNoSuchElementException();
        }
        return this.head.ele;
    }

    public E getLast() {
        if (this.size() == 0) {
            throw new UserNoSuchElementException();
        }
        return this.tail.ele;
    }

    public boolean add(E ele) {
        addLast(ele);
        return true;
    }

    public void addLast(E ele) {
        Node<E> newNode = new Node<>(ele);
        if (this.size() == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.index++;
    }

    public E removeFirst() {
        if (this.size() == 0) {
            throw new UserNoSuchElementException();
        }
        Node<E> temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.index--;
        if (this.size() == 0)
            this.tail = null;
        return temp.ele;
    }
    public E removeLast(){
        if(this.size() == 0)
            throw new UserNoSuchElementException();

        E temp = null;
        if(this.size()==1){
            temp = this.tail.ele;
            this.head = null;
            this.tail = null;
        }else{
            Node<E> currNode = this.head;
            for(int i=0;i<this.size()-2; i++){
                currNode = currNode.next;
            }
            temp = this.tail.ele;
            currNode.next = null;
            this.tail = currNode;
        }
        this.index--;
        return temp;
    }
    public boolean contains(Object obj){
        E ele = (E)obj;
        if(this.size()==0) return false;

        Node<E> currNode = this.head;
        while(currNode.next!=null){
            if(currNode.ele.equals(ele)) return true;
            currNode = currNode.next;
        }
        if(currNode.ele.equals(ele))
            return true;
        return false;
    }
    public void add(int index, E ele){
        if(index<0 || index>=this.size())
            throw new UserIndexOutOfBoundException(index+" is invalid");
        if(this.size() == 0 || index == 0){
            addFirst(ele);
            return;
        }
        if(index == this.size()-1){
            addLast(ele);
            return;
        }
        Node<E> newNode = new Node<E>(ele);
        Node<E> currNode1 = this.head;
        for(int i=0; i<index-1; i++){
            currNode1 = currNode1.next;
        }
        newNode.next = currNode1.next;
        currNode1.next = newNode;
        this.index++;
    }
    public E remove(int index){
        if(index<0 || index>=this.size())
            throw new UserIndexOutOfBoundException(index+" is invalid");

        if(index == 0) return removeFirst();
        if(index == this.size()-1) return removeLast();

        Node<E> curr1 = this.head;
        for(int i=0; i<index-1; i++){
            curr1=curr1.next;
        }
        Node<E> curr2 = curr1.next;
        curr1.next = curr2.next;
        curr2.next=null;
        this.index--;
        return curr2.ele;
    }
    public int indexOf(Object obj){
        E ele = (E)obj;
        if(this.size() == 0) return-1;

        Node<E> currNode = this.head;
        for(int i=0; i<this.size(); i++){
            if(currNode.ele.equals(ele)) return i;
            currNode = currNode.next;
        }
        return -1;
    }
}
public class Singly_LinkedList_Implementation {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        System.out.println(list1);
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);
        System.out.println("___----_____----____----___");

        UserLinkedList<Integer> list2 = new UserLinkedList<>();
        System.out.println(list2);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.remove(1);
        System.out.println(list2);

        System.out.println(list2.contains(50));
    }
}
