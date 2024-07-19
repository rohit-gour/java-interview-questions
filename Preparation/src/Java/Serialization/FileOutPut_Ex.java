package Java.Serialization;

import java.io.*;

public class FileOutPut_Ex {

    public static void getOrCreateFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Student.text");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Student s = new Student();
        objectOutputStream.writeObject(s);

        System.out.println("File saved!!");
        objectOutputStream.close();
    }

    public static void readSerializedFile(){

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Student.text"))){
            Student s = (Student)objectInputStream.readObject();
            System.out.println(s.toString());
        }
        catch(IOException i){
            System.out.println("Got Exception");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) throws IOException {

        getOrCreateFile();
        readSerializedFile();
    }
}

class Student implements Serializable {
    transient int id;
    final String name;

    public Student(){
        this(12,"Rohit");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int i, String name){
        this.id = i;
        this.name = name;
    }
}