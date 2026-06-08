package Collection_FrameWork.Stack;


import java.util.ArrayList;
class UserNoSuchElementException extends RuntimeException{
    UserNoSuchElementException(){
        super();
    }
}
class UserStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    @Override
    public String toString() {
        return list.toString();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
    //push
    public void push(E data) {
        list.add(data);
    }
    //pop
    public E pop() {
        if(isEmpty())
            throw new UserNoSuchElementException();
        E top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }
    //peek
    public E peek() {
        if(isEmpty())
            throw new UserNoSuchElementException();
        return list.get(list.size() - 1);
    }
}

public class Stack_Using_ArrayList {
    public static void main(String[] args) {
        UserStack<Integer> s = new UserStack<>();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("After push: " + s);
        System.out.println("peek: "+s.peek());
        System.out.println("pop: " + s.pop());
        System.out.println("peek: " + s.peek());
    }
}
