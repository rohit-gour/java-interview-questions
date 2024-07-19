package Java.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {

     int id;
    String name;
    String add;

    public Employee(){
        this(1, "Rohit", "Bangalore");
    }

    public Employee(int i, String name, String add) {
        this.id = i;
        this.name = name;
        this.add = add;
    }
}
