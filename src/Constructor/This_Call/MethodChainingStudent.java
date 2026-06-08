package Constructor.This_Call;

class Student{
    String name;
    int marks;

    Student setName(String name){
        this.name=name;
        return this;
    }
    Student setMarks(int marks){
       this.marks=marks;
       return this;
    }
    Student shows(){
        System.out.println("Name : "+name);
        System.out.println("Marks : "+marks);
        return this;
    }

}
public class MethodChainingStudent {
    public static void main(String[] args) {
        new Student().setName("Ramesh").setMarks(90).shows();

    }
}
