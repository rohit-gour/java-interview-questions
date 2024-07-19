package Java_Brain;



import java.util.Date;
import java.util.Objects;

public class HashCode_Ex {
    public static void main(String[] args) {
        Date current = new Date();
        Person p = new Person("Rohit", "Gour", 26, current);
        Person q = new Person("Rohit", "Gour", 26, current);

        System.out.println(p.equals(q));
        System.out.println(p.hashCode()== q.hashCode());

    }


}
class Person{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age, Date lastModifiedDate ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = lastModifiedDate;
    }
    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(o == null ||getClass()!= o.getClass())
            return false;

        Person p = (Person)o;
        if(p.firstName.equals(firstName) && p.lastName.equals(lastName) && p.age == age){
            return true;
        }
        return false;
    }
    //Overriding HashCode method to compare more
    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, age);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    private Date lastModifiedDate;

}