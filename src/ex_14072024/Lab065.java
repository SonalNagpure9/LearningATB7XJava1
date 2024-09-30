package ex_14072024;

public class Lab065 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + a++ + a++);
        // A - ++a , Exp1 -> 11, a -> 11
        // B - a++, Exp2-> 11, a -> 12
        //C - a++, Exp3 -> 12, a-> 13
       // op->  Exp 1 + Exp2 + Exp 3, a = 13
        System.out.println(a);
    }
}
