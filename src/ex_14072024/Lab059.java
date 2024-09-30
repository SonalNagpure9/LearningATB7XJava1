package ex_14072024;

public class Lab059 {
    public static void main(String[] args) {
        //int course = 100;
       // float GST = 18.45F;
        //int total_price = course+GST; // Implicit Narrowing - JVM
        //int total_price = course+(int)GST; // Explicit Narrowing Real Time

        //System.out.println(total_price);

        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST;
        float total_price = course+GST;

        System.out.println(total_price);


    }
}
