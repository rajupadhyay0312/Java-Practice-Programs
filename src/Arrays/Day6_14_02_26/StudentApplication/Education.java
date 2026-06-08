package Arrays.Day6_14_02_26.StudentApplication;

public class Education {
    String university;
    String course;
    int yop;
    double cgpa;

    public Education(String university,
                     String course,
                     int yop, double cgpa) {
        this.university = university;
        this.course = course;
        this.yop = yop;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Education{" +
                "university='" + university + '\'' +
                ", course='" + course + '\'' +
                ", yop=" + yop +
                ", cgpa=" + cgpa +
                '}';
    }
}
