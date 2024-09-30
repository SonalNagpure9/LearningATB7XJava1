package ex_14072024;

public class Lab064 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + ++a);
        // A = ++a -> Exp - 11, a = 11
        //+
        // B = ++a -> Exp - 12, a = 12
        // A + B = 23, a = 12
        System.out.println(a);

    }
}
