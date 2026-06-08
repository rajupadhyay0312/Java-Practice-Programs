package Collection_FrameWork.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class IdComparator implements Comparator<Student>{
    @Override
    public int compare(Student obj1, Student obj2){
//        if(obj1.id > obj2.id) return 1; //positive
//        else if(obj1.id < obj2.id) return -1; //Negative
//        else return 0; //equal

        //Descending
       // return obj2.id - obj1.id;

        //Ascending
        return obj1.id - obj2.id;


    }
}
public class ComparatorInterfaceDriver {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(103,"Ramesh"));
        list.add(new Student(104,"Suresh"));

        Collections.sort(list, new IdComparator());
        for(Student s : list){
            System.out.println(s);
        }
    }
}
