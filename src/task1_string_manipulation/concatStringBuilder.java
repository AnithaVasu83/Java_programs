package task1_string_manipulation;

public class concatStringBuilder {
    public static void main(String[] args) {
        String s1="Zoho";
        String s2="corp";
        StringBuilder sb=new StringBuilder();
        sb.append(s1);
        sb.append(" ");
        sb.append(s2);
        String result=sb.toString();
        System.out.println(result);
    }
}

