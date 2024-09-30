package ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        //Widening
        byte b = 10;
        int a = b ; //Implicit casting valid /jvm
        int a1 = (int)b; //Explicit casting
        System.out.println(a1);

        //Narrowing
        int val = 300;
        //byte b1 = val; //invalid Implicit casting
        byte b1 = (byte)val; //Explicit casting //loss of data
        System.out.println(b1);
    }
}
