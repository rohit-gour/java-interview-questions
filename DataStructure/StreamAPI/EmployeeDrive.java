package DataStructure.StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDrive {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Rohit",1,"Carelon","Banglore"));
        employeeList.add(new Employee("Shubham",2,"Carelon", "Bangalore"));
        employeeList.add(new Employee("Saumrit",3,"Cognizent","Chennai"));
        employeeList.add(new Employee("Nihal",4,"Accenture","Indore"));
        employeeList.add(new Employee("Deepak",5,"Mindtree","Pune"));
        employeeList.add(new Employee("Pawan",6,"Accenture","Pune"));
        employeeList.add(new Employee("Maha",7,"IBM","Hyderabad"));
        employeeList.add(new Employee("Mansa",8,"USA","Chicago"));

        Map<Integer,Employee> employeeMap = new HashMap<>();
        employeeMap.put(1000,new Employee("Rohit",1,"Carelon","Banglore"));
        employeeMap.put(2000,new Employee("Shubham",2,"Carelon", "Bangalore"));
        employeeMap.put(3000,new Employee("Saumrit",3,"Cognizent","Chennai"));
        employeeMap.put(4000,new Employee("Nihal",4,"Accenture","Indore"));
        employeeMap.put(5000,new Employee("Deepak",5,"Mindtree","Pune"));
        employeeMap.put(6000,new Employee("Pawan",6,"Accenture","Pune"));
        employeeMap.put(7000,new Employee("Maha",7,"IBM","Hyderabad"));
        employeeMap.put(8000,new Employee("Mansa",8,"USA","Chicago"));

        List<String> nameOfAllEmployee = employeeMap.values().stream().filter(id ->id.getId()>5).map(Employee::getName).collect(Collectors.toList());
        System.out.println(nameOfAllEmployee);

//        String name = employeeMap.values().stream().map(Employee::getCompanyName).filter();
    }
}
