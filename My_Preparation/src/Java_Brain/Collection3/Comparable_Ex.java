package Java_Brain.Collection3;

public class Comparable_Ex  {
    private String name="Shuham";
    private int age = 25;


    public static void main(String [] args){

        Comparable_Ex comparableEx = new Comparable_Ex();
        Person person = new Person();
//        System.out.println(person.compareTo(comparableEx));

    }


}
class Person implements Comparable<Person>{
    public String name = "Rohit";
    public int age = 20;
    public int compareTo(Person o){
        return this.age-o.age;
    }


}
