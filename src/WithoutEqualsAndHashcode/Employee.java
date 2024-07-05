package src.WithoutEqualsAndHashcode;

//Equals and hashcode without implementation
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

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args){
        Employee e = new Employee("nishi",29);
        Employee e1 = new Employee("nishi",29);

        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());
        System.out.println(e.equals(e1));
    }
}
