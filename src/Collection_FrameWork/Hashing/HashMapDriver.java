package Collection_FrameWork.Hashing;

import java.util.LinkedList;

class UserHashMap<K,V>{
    private class Node{
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private int size;
    private int N; // bucket size
    private LinkedList<Node> [] buckets;

    public UserHashMap() {
        this.N = 4;
        this.buckets = new LinkedList[N];
        initBucket(N);
    }
    // Initialize new linkedList in bucket...
    private void initBucket(int N){
        buckets = new LinkedList[N];
        for(int i=0; i<buckets.length; i++){
            buckets[i] = new LinkedList<>();
        }
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for(int i=0; i<buckets.length; i++){
            for(Node node : buckets[i]){
                sb.append(node.key)
                        .append(" = ")
                        .append(node.value).append(" ");

            }
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(" }");
        return sb.toString();
    }

    private int hashFunction(K key){
        int hc = key.hashCode();
        return Math.abs(hc) % N;
    }
    private int searchInLL(K key, int bi){
        LinkedList<Node> ll = buckets[bi];

        for(int i=0; i<ll.size(); i++){
             Node node = ll.get(i);
             if(node.key == key) return i;
        }
        return -1;
    }
    private void rehash(){
        LinkedList<Node>[] oldBuckets = buckets;
        N = N*2;
        initBucket(N);
        size = 0;

        for(LinkedList<Node> ll : oldBuckets){
            for(Node node : ll){
                put(node.key, node.value);
            }
        }
    }

    public void put(K key, V value){
        int bi = hashFunction(key);
        int di = searchInLL(key,bi);

        if(di == -1){
            buckets[bi].add(new Node(key,value));
            size++;
        }else{
            Node node = buckets[bi].get(di);
            node.value = value;
        }
        double lambda = (double) size/N;
        if(lambda > 0.75) rehash();
    }
    public V get(K key){
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);

        if(di == -1) return null;
        else return buckets[bi].get(di).value;
    }
    public boolean containKey(K key){
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);
        return di != -1;
    }
    public V remove(K key){
        int bi = hashFunction(key);
        int di = searchInLL(key,bi);

        if(di == -1) return null;
        Node node = buckets[bi].remove(di);
        size--;
        return node.value;
    }
}
public class HashMapDriver {
    public static void main(String[] args) {
        UserHashMap<String, Integer> hm = new UserHashMap<>();
        hm.put("India",140);
        hm.put("China",45);
        hm.put("Iran",20);
        hm.put("UK",100);
        System.out.println("After put: "+hm);

        System.out.println("get: "+hm.get("China"));
        System.out.println("containKey: "+hm.containKey("UK"));
        System.out.println("remove: "+hm.remove("Iran"));
    }
}
