package Java8.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class DummyData {
    public static List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace");
    public static List<Integer> numbers = Arrays.asList(10, 23, 7, 15, 42, 8, 56, 30, 19, 25);
    public static List<String> cities = Arrays.asList("New York", "London", "Paris", "Tokyo", "Sydney", "Berlin", "Beijing", "Paris","New York");
    public static List<Person> people = Arrays.asList(
            new Person("John", 28, Gender.MALE),
            new Person("Mary", 35, Gender.FEMALE),
            new Person("Chris", 22, Gender.MALE),
            new Person("Anna", 29, Gender.FEMALE),
            new Person("Mike", 40, Gender.MALE),
            new Person("Sophie", 33, Gender.FEMALE),
            new Person("Tom", 25, Gender.MALE),
            new Person("Emily", 30, Gender.FEMALE)
    );

    public static void main(String[] args) {
        // You can use this main method to test your stream operations
        //Retrieve all names using Stream

//        names.forEach(name -> System.out.println(name));
        /*Find the sum */
        int sum = DummyData.numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);

        /*Distinct city*/
//        cities.stream().distinct().forEach(city -> System.out.println(city));

/*        List<Person> name = people.stream().filter(f -> f.getAge()<30).collect(Collectors.toList());
        name.stream().forEach(a -> System.out.println(a.getName()));*/

        /*Find average age of female*/

        /*OptionalDouble avg = people.stream().filter(f -> f.getGender().equals(Gender.FEMALE)).mapToInt(Person::getAge).average();
        System.out.println(avg.getAsDouble());*/

        /*Tranform name into capital*/
//        List<String> p = people.stream().map(Person::getName).map(String::toUpperCase).collect(Collectors.toList());
//        p.stream().forEach(a-> System.out.println(a));

        //Check if any person having name Alice

     /*   people.stream().forEach(name ->{
            if(name.getName().equals("Alice")){
            System.out.println("Yes");
            return;}
            else
                System.out.println("No");
        });*/

        //Print the no in decending order

//        List<Integer> l1 = numbers.stream().sorted(Comparator.reverseOrder()).toList();
//        l1.stream().forEach(no-> System.out.print(no));

        
    }
}
