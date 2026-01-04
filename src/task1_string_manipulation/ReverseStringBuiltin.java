package task1_string_manipulation;

public class ReverseStringBuiltin {

    public static void main(String[] args)
    {
        String s="Hello";
        String reversed=new StringBuilder(s).reverse().toString();
        System.out.println("Reversed String: "+reversed);
    }
}
