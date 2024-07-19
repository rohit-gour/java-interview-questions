package DataStructure.StreamAPI;

public class Employee {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String companyName;
    private String location;

    public Employee(String name, int id, String companyName, String location){
        this.name = name;
        this.id = id;
        this.companyName = companyName;
        this.location = location;
    }
}
