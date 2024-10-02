package ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name1 = "Testing Academy"; //SCP
        String name2 = "Testing Academy";  //SCP
        String name3 = new String("Testing Academy");   //HEap area
        System.out.println(name1 == name3);  // check for ref
        System.out.println(name1.equals(name3)); // check for content

    }
}
