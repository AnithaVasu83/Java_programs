package task1_string_manipulation;

public class ConcatForLoop {
    public static void main(String[] args) {


        String s1 = "Zoho";
        String s2 = "corp";
        char[] result = new char[s1.length() + s2.length()];
        int k = 0;
        for (int i = 0; i < s1.length(); i++) {
            result[k++] = s1.charAt(i);
        }

        for (int i = 0; i < s2.length(); i++) {
            result[k++] = s2.charAt(i);
        }
        String concat = new String(result);
        System.out.println(concat);


    }
}