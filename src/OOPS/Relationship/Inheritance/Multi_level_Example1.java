package OOPS.Relationship.Inheritance;

class Country {
    String name;
    String capital;
    String language;
    String president;
    String countryCode;
    char currency;
    long population;
    double area;

    public Country(String name, String capital, String language, String president, String countryCode, char currency, long population, double area) {
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.president = president;
        this.countryCode = countryCode;
        this.currency = currency;
        this.population = population;
        this.area = area;
    }

    public void displayCountryInfo() {
        System.out.println("\n COUNTRY INFO");
        System.out.println("Name : " + name);
        System.out.println("Capital : " + capital);
        System.out.println("Language : " + language);
        System.out.println("President : " + president);
        System.out.println("Country code : " + countryCode);
        System.out.println("Currency :" + currency);
        System.out.println("Population :" + population);
    }
}

class State extends Country {

    String stateName;
    String stateCapital;
    String stateLanguage;
    String cm;
    long statePopulation;
    double stateArea;

    public State(String name, String capital, String language, String president, String countryCode, char currency, long population, double area, String stateName, String stateCapital, String stateLanguage, String cm, long statePopulation, double stateArea) {
        super(name, capital, language, president, countryCode, currency, population, area);
        this.stateName = stateName;
        this.stateCapital = stateCapital;
        this.stateLanguage = stateLanguage;
        this.cm = cm;
        this.statePopulation = statePopulation;
        this.stateArea = stateArea;
    }

    public void displayStateInfo() {
        System.out.println("\n STATE INFO");
        System.out.println("Name : " + name);
        System.out.println("Capital : " + capital);
        System.out.println("Language : " + language);
        System.out.println("CM : " + cm);
        System.out.println("Population : " + population + "KM^2");
        System.out.println("Area : " + area);
    }
}

class District extends State {
    String distName;
    String collector;
    long distPopulation;
    double distArea;

    public District(String name, String capital, String language, String president, String countryCode, char currency, long population, double area, String stateName, String stateCapital, String stateLanguage, String cm, long statePopulation, double stateArea, String distName, String collector, long distPopulation, double distArea) {
        super(name, capital, language, president, countryCode, currency, population, area, stateName, stateCapital, stateLanguage, cm, statePopulation, stateArea);
        this.distName = distName;
        this.collector = collector;
        this.distPopulation = distPopulation;
        this.distArea = distArea;
    }

    public void displayDistrict() {
        System.out.println("\n DISTRICT INFO ");
        System.out.println("Name : " + name);
        System.out.println("Collector : " + collector);
        System.out.println("Population : " + population);
        System.out.println("Area : " + area);
    }
}

class Taluka extends District {
    String talukaName;
    long talukaPopulation;
    double talukaArea;

    public Taluka(String name, String capital, String language, String president, String countryCode, char currency, long population,
                  double area, String stateName, String stateCapital, String stateLanguage, String cm, long statePopulation,
                  double stateArea, String distName, String collector, long distPopulation, double distArea,
                  String talukaName, long talukaPopulation, double talukaArea) {
        super(name, capital, language, president, countryCode, currency, population, area, stateName, stateCapital,
                stateLanguage, cm, statePopulation, stateArea, distName, collector, distPopulation, distArea);
        this.talukaName = talukaName;
        this.talukaPopulation = talukaPopulation;
        this.talukaArea = talukaArea;
    }

    public void displayTalukaInfo() {
        System.out.println("\n TALUKA INFO ");
        System.out.println("Name : " + name);
        System.out.println("Population : " + population);
        System.out.println("Area : " + area);
    }
}

public class Multi_level_Example1 {
    public static void main(String[] args) {
        Taluka taluka = new Taluka("India", "New Delhi", "English/Hindi", "Draupadi murmu", "+91",
                '₹', 1460000000, 3456789, "Maharashtra", "Mumbai", "Marathi",
                "Devendra padnavis", 126000000, 307713, "Nagpur", "Dr. Vipin Vithoba Itankar",
                3200000, 2172, "Hingna", 500000, 100);
        taluka.displayCountryInfo();
        taluka.displayStateInfo();
        taluka.displayDistrict();
        taluka.displayTalukaInfo();
    }
}
