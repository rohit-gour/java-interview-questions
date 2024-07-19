package HashMapQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        // TODO
        // List all distinct project in non-ascending order.


        //First Exract all the project
        List<Project> projectList = employeeList.stream().flatMap(employee -> employee.getProjects().stream()).collect(Collectors.toList());

        //fatch the prject in non-asscending order
        List<Project> distinctProject = projectList.stream().distinct().sorted(Comparator.comparing(Project::getName).reversed()).collect(Collectors.toList());
     //   distinctProject.forEach(project -> System.out.println(project.getName()));


        //
        //Print full name of any employee whose firstName starts with ‘A’.
        List<Employee> list = employeeList.stream().filter(employee -> employee.getFirstName().startsWith("A")).collect(Collectors.toList());

      //  list.forEach(e-> System.out.println(e.getFirstName()+" "+e.getLastName()));

        //Sort by first Name and same by salary

        List<Employee> employeeList1 = employeeList
                .stream()
                .sorted(Comparator
                .comparing(e->e.getFirstName())).collect(Collectors.toList());

        employeeList1.forEach(System.out::println);
    }
}