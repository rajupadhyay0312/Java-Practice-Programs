package Collection_FrameWork.Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Nagpur");
        cities.add("Chandrapur");
        cities.add("Nashik");
        cities.add("Pune");
        cities.add("Ahmedabad");

        // iterator
        System.out.println("----Using Iterator----");
        Iterator<String> it = cities.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        //for each loop
        System.out.println("---Using for each loop----");
        for(String city : cities)
            System.out.println(city);
    }
}
