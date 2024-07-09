package src.WithoutEqualsAndHashcode;

import java.util.HashMap;
import java.util.Objects;

//Ques: understanding equals() and hashCode() method
public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        System.out.println("in equals : "+ name.equals(employee.name));
        return age == employee.age && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        System.out.println("in hashcode : "+Objects.hash(name, age));
        return Objects.hash(name, age);
    }

    public void setAge(int age) {
        this.age = age;
    }


    //Without equals() and hashCode() method, everytime different hash values are generated,
    //for the objects whose internals are same but objects differs.
    //Thus, we require hashCode() method to generate same hash value.
    //Now even if hashCode are same, Object's equals() method is called which compares reference pointing,
    //and to prove objects are same we override equals() in class.
    public static void main(String[] args){

        HashMap<Employee, Integer> hm = new HashMap<>();
        Employee e = new Employee("nishi",29);
        Employee e1 = new Employee("nishi",29);
        Employee e2 = new Employee("mahesh",29);

        System.out.println("Executing hashmap functions");
        hm.put(e, 100);
        hm.put(e1, 1230);
        hm.put(e2, 1000);
        hm.keySet().forEach(System.out::println);
        hm.values().forEach(System.out::println);

    }
}
