package Collection_FrameWork.Hashing;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert -O(1)
        hm.put("India",100);
        hm.put("China",34);
        hm.put("UK",50);
        System.out.println(hm);

        //Get - O(1)
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Indonesia"));

        //ContainsKey - 0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //Remove - O(1)
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm.remove("India"));
    }
}
