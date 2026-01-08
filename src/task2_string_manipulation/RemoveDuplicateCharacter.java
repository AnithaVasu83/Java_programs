package task2_string_manipulation;

public class RemoveDuplicateCharacter {

    public static void main(String[] args) {

        String s="Programming";
        //String result="";
        StringBuilder result1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //if(result.indexOf(ch)==-1)
                //result += ch;
            if(result1.indexOf(String.valueOf(ch))==-1)
                result1.append(ch);
        }
        String result=result1.toString();
        System.out.println(result);

    }
}
