package task2_string_manipulation;

public class StringCompression {

    public static String compressedString(String s){
        if(s==null || s.isEmpty()){
            return "";
        }

        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int count = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (ch == s.charAt(j))
                    count++;
                else break;
            }
            result.append(ch).append(count);
            i+=count-1;
        }


        if(result.length()>=s.length())
            return s;
        else return result.toString();


    }

    public static void main(String[] args) {
        String str="aaabbbccc";
        System.out.println("Original String: "+str+ " Compressed String: "+compressedString(str));


    }
}
