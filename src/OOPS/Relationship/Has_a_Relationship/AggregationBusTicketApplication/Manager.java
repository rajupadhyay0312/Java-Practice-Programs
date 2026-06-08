package OOPS.Relationship.Has_a_Relationship.AggregationBusTicketApplication;

public class Manager {
    private String name;
    private long contact;
    private String pass;

    public Manager(String name, long contact, String pass) {
        this.name = name;
        this.contact = contact;
        this.pass = pass;
    }
    public void getManagerInfo(){
        System.out.println("\n ** MANAGER INFO");
        System.out.println("Name : "+name);
        System.out.println("Contact : "+contact);
        System.out.println("Password : "+pass);
    }
    public long getContact(){
        return this.contact;
    }
    public String getPassword(){
        return this.pass;
    }
}
