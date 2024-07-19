package Java.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Rohit.ser"));

        Employee employee = new Employee();
        o.writeObject(employee);
        o.close();
    }
}
