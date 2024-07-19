package Java_Brain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        List<HashMap<String, Object>> listOfEmp = new ArrayList<>();
        HashMap<String, Object> employee = new HashMap<>();
        employee.put("empId", 1);
        employee.put("employeeName", "alpha");
        listOfEmp.add(employee);

        employee = new HashMap<>();
        employee.put("empId", 2);
        employee.put("employeeName", "Beta");
        listOfEmp.add(employee);

        employee = new HashMap<>();
        employee.put("empId", 3);
        employee.put("employeeName", "gama");
        listOfEmp.add(employee);

        employee = new HashMap<>();
        employee.put("empId", 4);
        employee.put("employeeName", "Theta");
        listOfEmp.add(employee);

        int idToRemove = 2;

        for (int i = 0; i < listOfEmp.size(); i++) {
            HashMap<String, Object> hashMap = listOfEmp.get(i);
            if (hashMap.get("empId").equals(idToRemove)) {
                listOfEmp.remove(hashMap);  // This may cause IndexOutOfBoundsException
            }
        }
        System.out.println(listOfEmp);
    }
}
