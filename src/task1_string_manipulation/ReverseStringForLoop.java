package task1_string_manipulation;

public class ReverseStringForLoop {

    public static void main(String[] args){

        String s="Hello World";
        String reverse="";
        for(int i=s.length()-1; i>=0; i--)
        {
            reverse += s.charAt(i);
        }
        System.out.println("Reversed String: "+reverse);
    }
}
