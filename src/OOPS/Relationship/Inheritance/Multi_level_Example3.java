package OOPS.Relationship.Inheritance;

class Year{
    int year;
    boolean isLeapYear;
    int totalMonth;
    int totalDays;

    public Year(int year, boolean isLeapYear, int totalMonth, int totalDays) {
        this.year = year;
        this.isLeapYear = isLeapYear;
        this.totalMonth = totalMonth;
        this.totalDays = totalDays;
    }
    public void displayYear() {
        System.out.println("\n\nYear [" +
                "year=" + year +
                ", isLeapYear=" + isLeapYear +
                ", totalMonth=" + totalMonth +
                ", totalDays=" + totalDays +
                "]");
    }
}
class Month extends Year{
    String monthName; // jan, feb, may, april
    int daysInMonth; // 365-366
    int monthNumber; //1-12

    public Month(int year, boolean isLeapYear, int totalMonth, int totalDays, String monthName, int daysInMonth, int monthNumber) {
        super(year, isLeapYear, totalMonth, totalDays);
        this.monthName = monthName;
        this.daysInMonth = daysInMonth;
        this.monthNumber = monthNumber;
    }
    public void displayMonth() {
        System.out.println("Month [" +
                "monthName='" + monthName +
                ", daysInMonth=" + daysInMonth +
                ", monthNumber=" + monthNumber +
                "]");
    }
}
class Day extends Month{
    String dayName; // sunday, monday
    int dayNumber;// 1-31
    boolean isWeekend;

    public Day(int year, boolean isLeapYear, int totalMonth, int totalDays, String monthName, int daysInMonth, int monthNumber, String dayName, boolean isWeekend) {
        super(year, isLeapYear, totalMonth, totalDays, monthName, daysInMonth, monthNumber);
        this.dayName = dayName;
        this.isWeekend = isWeekend;
    }
    public void displayDay() {
        System.out.println("Day [" +
                "dayName=" + dayName +
                ", dayNumber=" + dayNumber +
                ", isWeekend=" + isWeekend +
                "]");
    }
}
public class Multi_level_Example3 {
    public static void main(String[] args) {
      Day day = new Day(2025,false,12,365,"DECEMBER",31,
              12,"Wednesday",false);
      day.displayYear();
      day.displayMonth();
      day.displayDay();
    }
}
