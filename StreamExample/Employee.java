package StreamExample;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private double salary;
    private String address;
    private int age;

    public Employee(String name, double salary, String address, int age) {
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Employee> getDummyEmployees() {
        return Arrays.asList(
                new Employee("John Doe", 50000, "123 Elm Street", 30),
                new Employee("Jane Smith", 55000, "456 Maple Avenue", 28),
                new Employee("Emily Davis", 60000, "789 Oak Boulevard", 35),
                new Employee("Emily Davis", 60000, "789 Oak Boulevard", 35),
                new Employee("Michael Brown", 70000, "101 Pine Road", 40),
                new Employee("Jessica White", 65000, "202 Birch Lane", 32)
        );
    }

    public static void main(String[] args) {
        List<Employee> employees = Employee.getDummyEmployees();
//        employees.forEach(System.out::println);

        //print all the employee whoose salary more than 60k
        /*List<Employee> list = employees.stream().filter(sal -> sal.getSalary()>60000)
                .collect(Collectors.toList());
        for(Employee e: list){
            System.out.println(e);
        }*/

        //print the avg age of all the employee
       /* double avgAge = employees.stream().mapToInt(Employee::getAge).average().getAsDouble();
        System.out.println(avgAge);*/

     /*   Map<Integer, List<Employee>> list = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        for(Map.Entry e: list.entrySet()){
            System.out.println(e);
        }*/

//        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
/*
        String names = employees.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(names);*/

//        double totalSalary = employees.stream().filter(x -> x.address.equals("123 Elm Street"))
//                .mapToDouble(Employee::getSalary).sum();
//
//        System.out.println(totalSalary);

        Set<Character>charSet = new HashSet<>(Arrays.asList('A','E','I','O','U'));

        double d = employees.stream()
                .filter(x -> charSet.contains(x.getName()
                        .charAt(0)))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
//        System.out.println(d);

//        Find the oldest employee from each city
        Map<String, Optional<Employee>> list = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAddress,Collectors.maxBy(Comparator.comparingInt(Employee::getAge))));

//        System.out.println(list);
//        Question: Sort employees first by age in ascending order, and for employees with the same age, sort them by salary in descending order.

        List<Employee> empList = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).thenComparingDouble(Employee::getSalary)).toList();
//        System.out.println(empList);

        //Question: Find the top 3 highest-paid employees based on salary.
        List<Employee> list1 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).toList();
        list1.forEach(System.out::println);
    }
}

