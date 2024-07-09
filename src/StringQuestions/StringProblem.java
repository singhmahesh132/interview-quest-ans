package src.StringQuestions;

public class StringProblem {
    public static void main(String[] args){

        String s1 = "ram";
        String s2 = new String("ram");
        String s3 = s1;
        System.out.println(s1.hashCode()+" :: "+s2.hashCode());
        System.out.println(s1 == s2);               //false
        System.out.println(s1.equals(s2));           //true
        System.out.println(s1 == s3);               //true
        StringBuilder s4 = new StringBuilder("ram");
        System.out.println(s2.equals(s4));          //false
    }
}
