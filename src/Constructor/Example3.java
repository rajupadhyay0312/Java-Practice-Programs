package Constructor;

class Ramesh {
    Ramesh() {
        System.out.println("Ramesh");
    }

    Ramesh(int a) {
        System.out.println("Ramesh(int a)");
    }
}

class Suresh extends Ramesh {

}

public class Example3 {
    public static void main(String[] args) {
        Suresh obj = new Suresh();
    }
}
