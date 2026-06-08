package Collection_FrameWork.Hashing;

import java.util.HashMap;

public class ValidAnagram_UsingHashMap {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        // count character of s
        for(char ch  : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        // reduce count using t
        for(char ch : t.toCharArray()){
            if(!map.containsKey(ch))
                return false;

            map.put(ch, map.get(ch)-1);

            //remove if the count becomes 0
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
     }
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
    }
}
