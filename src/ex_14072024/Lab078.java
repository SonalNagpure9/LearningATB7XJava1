package ex_14072024;

public class Lab078 {
    public static void main(String[] args) {
        String password = "Sonal@123";
        String pass_u  = password.toLowerCase();
        System.out.println(pass_u);
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));

        System.out.println(password.substring(0, 3));
        System.out.println(password.indexOf('o'));
        System.out.println(password.length( ));


    }
}
