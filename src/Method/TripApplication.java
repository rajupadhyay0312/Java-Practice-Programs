package Method;

import java.util.ArrayList;
import java.util.Arrays;
public class TripApplication {
    public static void main(String[] args){

        planningTrip();
  }
    public static void planningTrip(){
        String [] locationArr = location();
        ArrayList<String>list =  travellers(locationArr);
        ArrayList<String> object = essentials();

        System.out.println(Arrays.toString(locationArr));
        System.out.println(list);
        System.out.println(object);
    }
    public static String[] location(){
        String location = "DagduSheth Ganpati";
        String time ="8:50 am";
        String date = "09/10/2025";

        String [] locationArr = {location, time , date};
        return locationArr;
    }
    public static ArrayList<String> travellers(String [] locationArr){
        String person1 = "Ramesh Kumar";
        String person2 = "Suresh Kumar";
        String person3 = "Sakshi Kumari";

        ArrayList<String> listPerson = new ArrayList<String>();
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);

        return listPerson;
    }
    public static ArrayList essentials(){
        String waterBottle = "Miltion";
        String mobile = "SAMSUNG S21";
        double money = 101;
        String flowers = "HIBISCUS";
        String dua = "JALDI JOB LAGA DENA";
        String sweet = "UKIDICHA MODAK";

        ArrayList essentials = new ArrayList();
        essentials.add(waterBottle);
        essentials.add(mobile);
        essentials.add(money);
        essentials.add(flowers);
        essentials.add(dua);
        essentials.add(sweet);
        return essentials;
    }
}
