package src.HashSetUsingStringAsKey;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class MyMain {
    int id;
    String name;

    public MyMain(String name, int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyMain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyMain myMain))
            return false;
        return id == myMain.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        String s1 = "Mahesh";
        String s2 = new String("Mahesh");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);

        //Since String Class has already overridden hashCode() and equals() method
        //So due to hasCode() being same calculated on value of string,
        //Thus the values will be updated in case same key comes again.
        hm.put("Mahesh", "Hello");
        hm.put(new String("Mahesh"), "hello1");
        System.out.println(hm);

        //Since it is an userDefined object we need to override hashCode() and equals() method
        //Always first hashCode() is called, if hashCode is same then equal is called().
        HashSet<MyMain> hs = new HashSet<>();
        hs.add(new MyMain("Mahesh", 20));
        hs.add(new MyMain("Mahesh", 20));
        System.out.println(hs);
    }
}
