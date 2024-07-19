package InterviewSpecific;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee(1,"Rolhit",25000),
                new Employee(2,"Nihal",25800),
                new Employee(3,"Deepak",1000));

 //       String name = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get().getName();
  //      double name = list.stream().filter(s -> s.getName().equals("Rohit")).mapToDouble(Employee::getSalary).findFirst().orElse(0);
        List<Employee> name = list.stream().filter(s -> s.getId()>1).collect(Collectors.toList());
        System.out.println(name.toString());
    }
}
