package task1_string_manipulation;

public class ReverseWords {

    public static void main(String[] args){
        String s="Java is my favourite programming Language";
        String[] words=s.split(" ");
        int left=0;
        int right=words.length-1;
        String temp;
        while(left<right)
        {
            temp=words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
        }
        //String reversed=new String(words); is wrong only for char array
        String reversed=String.join(" ",words);
        System.out.println(reversed);

    }
}
