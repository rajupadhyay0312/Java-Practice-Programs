package Exception_Handling;

class InvalidMarksException extends Exception{
    InvalidMarksException(String desc){
        super(desc);
    }
}
class Student{
    String name;
    double marks;
    double percentage;

    //Constructor can throw exception just like method
    public Student(String name, double marks) throws InvalidMarksException{
        if(marks<0)
            throw new InvalidMarksException("Enter marks is Invalid");
        this.name = name;
        this.marks = marks;
        this.percentage = calculatePercentage(marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", percentage=" + percentage +
                '}';
    }
    public double calculatePercentage(double marks){
        return (marks/500)*100;
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Student obj = null;
        try{
            obj = new Student("Ramesh Kumar",-456);
        }
        catch(InvalidMarksException e){
            System.out.println("Enter marks was Invalid");
        }
        System.out.println(obj);
    }
}
