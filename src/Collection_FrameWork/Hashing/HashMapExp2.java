package Collection_FrameWork.Hashing;

import java.util.HashMap;
import java.util.Set;

public class HashMapExp2 {
    public static void main(String[] args){

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India",100);
        hm.put("China",34);
        hm.put("UK",50);
        hm.put("Indonesia",140);
        System.out.println(hm);

        System.out.println("_______________________");
        Set<String> keys = hm.keySet();

        for(String k : keys)
            System.out.println("key="+ k +", value="+hm.get(k));
    }
}
