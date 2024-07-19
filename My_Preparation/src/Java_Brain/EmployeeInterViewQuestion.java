package Java_Brain;

import java.util.*;

public class EmployeeInterViewQuestion {

    public static void removeEmp(List<HashMap<String, Object>> list, int id){

        // Solution by the help of Iterator

     /*   Iterator<HashMap<String, Object>> it = list.iterator();
        while (it.hasNext()){
            HashMap<String, Object> hashMap = it.next();
            if(hashMap.get("empId").equals(id)){
                it.remove();
            }
        }
        System.out.println(list);
*/
        //Solution using normal for-loop

        for(int i=0;i<list.size();i++){
            HashMap<String, Object> hashap = list.get(i);
            if(hashap.get("empId").equals(id)){
                list.remove(hashap);
            }
        }
        System.out.println(list);

    }
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
        employee.put("empId",3);
        employee.put("employeeName", "gama");
        listOfEmp.add(employee);

        employee = new HashMap<>();
        employee.put("empId", 4);
        employee.put("employeeName", "Theta");
       listOfEmp.add(employee);

       int id = 4;
        removeEmp(listOfEmp, id);

    }
}
