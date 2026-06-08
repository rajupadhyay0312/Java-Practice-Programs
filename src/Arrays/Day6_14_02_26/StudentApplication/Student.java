package Arrays.Day6_14_02_26.StudentApplication;

public class Student {
    static int id = 123123;
    String sid;
    String name;
    long contact;
    Education [] education = new Education[5];

    int eduIndex;
    {
        this.sid = "SID"+id++;
    }

    public Student(
            String name,
            long contact,
            Education[] education,
            int eduIndex) {
        this.name = name;
        this.contact = contact;
        this.education = education;
        this.eduIndex = eduIndex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                '}';
    }
}
