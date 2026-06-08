package Collection_FrameWork.Stack;

import java.util.NoSuchElementException;

class UserStack_Using_LinkedList<E> {
    private int index;
    private Node<E> head;

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
        if (this.size() == 0) return "[]";
        String rep = "[";
        Node<E> currNode = this.head;
        while (currNode.next != null) {
            rep += currNode.ele + ", ";
            currNode = currNode.next;
        }
        rep += currNode.ele + "]";
        return rep;
    }

    public void push(E ele) {
        Node<E> newNode = new Node<>(ele);
        if (this.size() == 0) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.index++;
    }

    public E pop() {
        if (this.size() == 0)
            throw new NoSuchElementException();
        E top = this.head.ele;
        this.head = this.head.next;
        this.index--;
        return top;
    }
    public E peek(){
        if (this.size() == 0)
            throw new NoSuchElementException();
        return this.head.ele;
    }
}

public class Stack_Using_LinkedList {
    public static void main(String[] args) {
        UserStack_Using_LinkedList<Integer> list = new UserStack_Using_LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        System.out.println("After push(E ele): " + list);
        System.out.println("pop(): "+list.pop());
        System.out.println("peek(): "+list.peek());
    }
}
