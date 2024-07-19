package Java;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args){

        Person person = new Person("",null);
//        String email = person.getEmail().map(String::toLowerCase).or("not given");
//        System.out.println(email);


        String name = person.getName();
        if(name!= null){
            System.out.println(name.length());
        }

        Optional<String > names = Optional.of(null);
        names.ifPresent(n -> System.out.println(n.length()));


    }
}
class Person{
    private String name;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
