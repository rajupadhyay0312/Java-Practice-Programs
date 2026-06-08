package Collection_FrameWork.Hashing;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Nagpur");
        lhs.add("Chandrapur");
        lhs.add("Nashik");
        lhs.add("Pune");
        lhs.add("Ahmedabad");
        System.out.println("After add:-"+lhs);

        lhs.remove("Pune");
        System.out.println("After remove:-"+lhs);
    }
}
