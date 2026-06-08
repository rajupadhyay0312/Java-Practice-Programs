package Collection_FrameWork.CollectionsClass;

import java.util.*;

class UserCollections{

    public static int frequency(Collection c, Object obj) {
        int count = 0;
        for (Object element : c) {
            if (obj == null) {
                if (element == null)
                    count++;
            } else {
                if (obj.equals(element)) count++;
            }
        }
        return count;
    }
    public static <T extends Comparable<T>> Comparator<T> reverseOrder(){
        return (a,b) -> b.compareTo(a);
    }
    public static <T extends Comparable<T>> T max(Collection<T> c){
        Iterator<T> it = c.iterator();
        T max = it.next();
        while(it.hasNext()){
            T val = it.next();
            if(val.compareTo(max)>0){
                max = val;
            }
        }
        return max;
    }
    public static <T extends Comparable<T>> T min(Collection<T> c){
        Iterator<T> it = c.iterator();
        T min = it.next();
        while(it.hasNext()){
            T val = it.next();
            if(val.compareTo(min)<0){
                min = val;
            }
        }
        return min;
    }
    public static <T> void fill(List<T> list, T value){
        for(int i=0; i<list.size(); i++){
            list.set(i,value);
        }
    }
    public static void shuffle(List list){
        Random random = new Random();
        for(int i=list.size()-1; i>0; i--){
            int j = random.nextInt(i+1);
            swap(list,i,j);
        }
    }
    public static <T> void swap(List<T> list, int i, int j){
        T temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static <T> void sort(List<T> list, Comparator<T> comp){
        for(int i=0; i<list.size(); i++){
            for(int j =i+1; j<list.size(); j++){
                if(comp.compare(list.get(i),list.get(j))>0){
                    T temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
public class CollectionsDriver {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(5);
        System.out.println("Original List: "+list);

        int freq = UserCollections.frequency(list,10);
        System.out.println("frequency: "+freq);
        UserCollections.sort(list, UserCollections.reverseOrder());
        System.out.println("Sorted(DSC): "+list);
        UserCollections.sort(list,(a,b)->a-b);
        System.out.println("Sorted(ASC): "+list);
        System.out.println("max:"+UserCollections.max(list));
        System.out.println("min:"+UserCollections.min(list));
        UserCollections.shuffle(list);
        System.out.println("shuffle: "+list);
        UserCollections.swap(list,1,3);
        System.out.println("After swap: "+list);
        UserCollections.fill(list,99);
        System.out.println("After fill: "+list);
    }
}
