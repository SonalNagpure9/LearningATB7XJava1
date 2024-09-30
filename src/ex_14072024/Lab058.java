package ex_14072024;

public class Lab058 {
    public static void main(String[] args) {
        long phone_no = 987654321098l;
        //short s = phone_no; // Implicit Narrowing  - JVM
        short s = (short) phone_no;
        System.out.println(s);

    }
}
