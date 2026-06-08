package Collection_FrameWork;

class UserEmptyStackException extends RuntimeException {
    public UserEmptyStackException() {
        super();
    }
}

class UserVector<E> {
    private E[] arr;
    private final int INITIAL_CAPACITY = 10;
    private int index;

    UserVector() {
        arr = (E[]) new Object[INITIAL_CAPACITY];
    }

    @Override
    public String toString() {
        if (this.size() == 0) return "[]";
        String op = "[";
        for (int i = 0; i < this.size() - 1; i++) {
            op += this.arr[i] + ", ";
        }
        op += this.arr[this.size() - 1] + "]";
        return op;
    }

    public int size() {
        return this.index;
    }

    public int capacity() {
        return this.arr.length;
    }

    public synchronized void addElement(E item) {
        if (this.size() == this.arr.length) {
            E[] newArr = (E[]) new Object[(this.capacity() * 2)];
            for (int i = 0; i < this.size(); i++) {
                newArr[i] = this.arr[i];
            }
            this.arr = newArr;
        }
        this.arr[this.index++] = item;
    }

    public E elementAt(int index) {
        if (index < 0 || index >= this.size())
            throw new UserIndexOutOfBoundException(index + " is invalid");

        return this.arr[index];
    }

    public E removeElementAt(int index) {
        if (index < 0 || index >= this.size())
            throw new UserIndexOutOfBoundException(index + " is invalid");

        E tempItem = this.arr[index];
        for (int i = index; i < this.size() - 1; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        this.arr[this.size() - 1] = null;
        this.index--;
        return tempItem;
    }

    public int lastIndexOf(Object obj) {
        E item = (E) obj;
        for (int i = this.size() - 1; i >= 0; i--) {
            if (this.arr[i].equals(item)) return i;
        }
        return -1;
    }
}

class UserStack<E> extends UserVector<E> {
    UserStack() {
        super();
    }

    public E push(E item) {
        addElement(item);
        return item;
    }

    public synchronized E peek() {
        if (this.size() == 0)
            throw new UserEmptyStackException();
        return elementAt(this.size() - 1);
    }

    public synchronized E pop() {
        //E tempItem = this.peek();
        return removeElementAt(this.size() - 1);
    }

    public boolean empty() {
        return this.size() == 0;
    }

    public synchronized int search(Object obj) {
        int i = lastIndexOf(obj);
        if (i >= 0) return this.size() - i;
        return -1;
    }
}

public class Vector_Stack_UserImplementation {
    public static void main(String[] args) {
        System.out.println("----------Vector---------");
        UserVector<Integer> v1 = new UserVector<>();
        v1.addElement(1);
        v1.addElement(2);
        v1.addElement(3);
        v1.addElement(2);
        System.out.println(v1);
        System.out.println("Size: " + v1.size());
        System.out.println("Capacity: " + v1.capacity());
        System.out.println("elementAt(int index): " + v1.elementAt(1));
        System.out.println("removeElementAt(int index): " + v1.removeElementAt(2));
        System.out.println(v1);
        System.out.println("lastInd1exOf(Object obj): " + v1.lastIndexOf(2));


        System.out.println("--------Stack--------");

        UserStack<Integer> stack1 = new UserStack<Integer>();
        System.out.println(stack1);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println(stack1);
        System.out.println("push(): " + stack1.push(40));
        System.out.println(stack1);
        System.out.println("peek(): " + stack1.peek());
        System.out.println("pop(): " + stack1.pop());
        System.out.println("empty(): " + stack1.empty());
        System.out.println("search: " + stack1.search(40));
        System.out.println(stack1);
    }
}
