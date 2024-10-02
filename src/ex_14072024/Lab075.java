package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String s1 = new String("sonal");
        String s2 = new String("sonal");
        String s3 = new String("sonal");
        System.out.println(s1 == s2); // check for ref
        System.out.println(s2 == s3);
         System.out.println(s2.equals(s3));
    }
}
