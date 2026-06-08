package Collection_FrameWork.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

class Employee implements Comparable<Employee>{
   int id;
   String name;
   double salary;

    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        if(this.salary<emp.salary)
            return -1;
        else if(this.salary>emp.salary)
            return 1;
        else
            return 0;
    }
}
public class ComparableInterfaceDriver {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(4,"Ramesh",300000));
        list.add(new Employee(2,"Suresh",450000));
        list.add(new Employee(1,"Rupesh",500000));
        list.add(new Employee(5,"Ganesh",600000));
        list.add(new Employee(8,"Gotya",250000));

        Collections.sort(list);
        ListIterator<Employee> li = list.listIterator();
        while(li.hasNext()) {
            Employee emp = (Employee) li.next();
            System.out.println(emp);
        }
    }
}
