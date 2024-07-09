package src.JPMorganEmpDepProg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Ques: Write a java program using stream to print employee name and department name of employee,
//having the latest version for specific country

public class MyMain {

    public void sortEmp(List<Employee> empList, Map<Integer,String> deptMap, String country) {
        //filtering employee list with country and then adding department name to employee object using department hashmap.
        List<Employee> empWithDeptName = empList.stream().filter(emp -> emp.getCountry().equals(country)).peek(emp -> emp.setDeptName(deptMap.get(emp.getDeptId()))).toList();

        //storing Employee object as key in hashmap with latest version as value
        //this is done as I have overridden hashcode() function to use only emp id and emp name to generate hash
        Map<Employee, Integer> empLatestVersion = new HashMap<>();
        empWithDeptName.forEach(emp -> {
            if (empLatestVersion.isEmpty() || empLatestVersion.get(emp)==null)
                empLatestVersion.put(emp, emp.getVersion());
            else {
                if (empLatestVersion.get(emp) < emp.getVersion()) {
                    empLatestVersion.put(emp, emp.getVersion());
                }
            }
        });

        //printing Employee name and department name
        empLatestVersion.keySet().forEach(emp-> System.out.println(emp.getName()+" "+emp.getDeptName()+" "+empLatestVersion.get(emp)));
    }

    public static void main(String[] args){
        MyMain m = new MyMain();

        List<Employee> empList = List.of(
                new Employee(1, "mahesh", 0, 2, 1, "ind"),
                new Employee(2, "nishi", 0, 1, 1, "ind"),
                new Employee(1, "mahesh", 0, 2, 2, "aus"),
                new Employee(1, "mahesh", 0, 3, 3, "ind"),
                new Employee(1, "mahesh", 0, 1, 4, "usa"),
                new Employee(2, "nishi", 0, 3, 2, "ind")
        );

        Map<Integer,String> deptMap = new HashMap<>();
        deptMap.put(1,"It");
        deptMap.put(2,"Comps");
        deptMap.put(3,"TELEComps");
        deptMap.put(4,"Civil");

        m.sortEmp(empList,deptMap,"usa");
    }
}
