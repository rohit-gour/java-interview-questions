package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Emp{
    String name;
    int id;
    String add;

    public Emp(String name, int id, String add){
        this.name = name;
        this.id = id;
        this.add = add;
    }
    public Emp(){

    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", add='" + add + '\'' +
                '}';
    }
///name.compareTo(o.name) &&
  /*  @Override
    public int compareTo(Emp o) {
        return Integer.compare(id, o.id);
    }*/
    public static void main(String[] args) {
        List<Emp> listOfEmp = new ArrayList<>();

        listOfEmp.add(new Emp("Rohit", 1,"Bangalore"));
        listOfEmp.add(new Emp("Shubham", 9,"Pune"));
        listOfEmp.add(new Emp("Rio", 6,"Bhopal"));
        listOfEmp.add(new Emp("Yashansh", 8,"Sehore"));
        listOfEmp.add(new Emp("Deepak", 3,"Indore"));
        listOfEmp.add(new Emp("Nihal", 5,"Hyd"));
        listOfEmp.add(new Emp("Ramesh", 2,"Bengal"));
        listOfEmp.add(new Emp("Rr", 11,"Bangalore"));

        Collections.sort(listOfEmp, (e1, e2) -> Integer.compare(e2.id,e1.id));

//        Collections.sort(listOfEmp,new NameComparator());
        for(Emp e: listOfEmp){
            System.out.println(e);
        }
    }
}
