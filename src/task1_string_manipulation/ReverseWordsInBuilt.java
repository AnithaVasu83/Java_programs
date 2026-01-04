package task1_string_manipulation;

public class ReverseWordsInBuilt {

    public static void main(String[] args) {
        String s = "Java is my favourite programming Language";
        String[] words = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        String reversed=sb.toString();
        System.out.println("Reversed String: "+reversed);

    }
}
