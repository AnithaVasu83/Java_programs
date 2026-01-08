package task2_string_manipulation;

public class KeepDuplicateCharacter {
    public static void main(String[] args) {
        String s="Programming";
        String result="";
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            //checks the first and last index of ch.if apperas once the index is same .so no duplicate
            if ( s.indexOf(ch) != s.lastIndexOf(ch) ){
                if (result.indexOf(ch) == -1)//checks there is no duplicate if duplicate indexof(ch) becomes 0,1,...
                {
                    result += ch;
                }
            }
        }
        System.out.println(result);
    }

}
