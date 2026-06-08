package Collection_FrameWork;

class DoublyLinkedList<E>{
    private int index;
    private Node<E> head;
    private Node<E> tail;

    private class Node<E>{
        E ele;
        Node<E> prev;
        Node<E> next;

        Node(E ele){
            this.ele = ele;
        }
    }
    @Override
    public String toString(){
        if(this.size() == 0)
            return "[]";

        String op = "[";
        Node<E> currNode = this.head;
        while(currNode != null){
            op += currNode.ele;
            if(currNode.next != null){
                op += ", ";
            }
            currNode = currNode.next;
        }
        op += "]";
        return op;
    }
    public int size(){
        return this.index;
    }
    public boolean add(E ele){
        Node<E> newNode = new Node<E>(ele);
        if(this.size() == 0){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.index++;
        return true;
    }
    public void addLast(E ele){
        add(ele);
    }
    public void addFirst(E ele){
        Node<E> newNode = new Node<E>(ele);
        if(this.size() == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.head.prev = newNode;
            newNode.next = this.head;
            this.head = newNode;
        }
        this.index++;
    }
    public E getFirst(){
        if(this.size() == 0){
            throw new UserNoSuchElementException();
        }
        return this.head.ele;
    }
    public E getLast(){
        if(this.size() == 0){
            throw new UserNoSuchElementException();
        }
        return this.tail.ele;
    }
    public E removeFirst(){
        if(this.size() == 0){
            throw  new UserNoSuchElementException();
        }
        E temp = null;
        if(this.size() == 1){
            temp = this.head.ele;
            this.head = null;
            this.tail = null;
        }else{
            temp = this.head.ele;
            this.head = this.head.next;
            this.head.prev = null;
        }
        this.index--;
        return temp;
    }
    public E removeLast(){
        if(this.size() == 0)
            throw new UserNoSuchElementException();

        E temp = null;
        if(this.size() == 1){
            temp = this.tail.ele;
            this.head = null;
            this.tail = null;
        }else{
            temp = this.tail.ele;
            this.tail = this.tail.prev;
            this.tail.next = null;
        }
        this.index--;
        return temp;
    }
    public E remove(int index){
        if(index<0 || index>=this.size())
            throw new UserIndexOutOfBoundException(index+" is inValid");

        if(this.size() == 0) throw new UserNoSuchElementException();
        if(index == 0) return removeFirst();
        if(index == this.size()-1) return removeLast();
        if((this.size()-index)<index)
            return backwardTraversingRemove(index);
        else
            return forwardTraversingRemove(index);
    }
    public E backwardTraversingRemove(int index){
        System.out.println("BTR");
        Node<E> currNode = this.tail;
        for(int i=size()-2; i>index-i; i--){
            currNode = currNode.prev;
        }
        Node<E> temp = currNode.prev;
        currNode.prev = temp.prev;
        temp.prev.next = currNode;
        temp.next = null;
        temp.prev = null;
        this.index--;
        return temp.ele;
    }
    public E forwardTraversingRemove(int index){
        System.out.println("FTR");
        Node<E> currNode = this.head;
        for(int i=0; i<index-1; i++){
            currNode = currNode.next;
        }
        Node<E> temp = currNode.next;
        currNode.next = temp.next;
        temp.next.prev = currNode;
        temp.next = null;
        temp.prev = null;
        this.index--;
        return temp.ele;
    }

}
public class DoublyLinkedList_Implementation {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list1 = new DoublyLinkedList<Integer>();
        System.out.println(list1);
        for(int i=10; i<=100; i+=10)
            list1.add(i);

        System.out.println("After add: "+list1);
        list1.addFirst(5);
        System.out.println("After addFirst: "+list1);

        list1.addLast(120);
        System.out.println("After addLast: "+list1);

        System.out.println("After getFirst: "+list1.getFirst());
        System.out.println("After getLast: "+list1.getLast());
        System.out.println("After removeFirst: "+ list1.removeFirst());
        System.out.println("After removeLast: "+list1.removeLast());
        System.out.println("After remove: "+list1.remove(1));

    }
}
