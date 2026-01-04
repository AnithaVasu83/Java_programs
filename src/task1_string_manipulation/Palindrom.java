package task1_string_manipulation;

public class Palindrom {
    public static void main(String[] args) {
        String s="Java";
        char[] arr=s.toCharArray();
        int left=0;
        int right = arr.length - 1;
        char temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String reversed=new String(arr);
        if(s.equals(reversed))
        {
            System.out.println("String is palindrome");
        }
        else
            System.out.println("String is not paindrome");

    }

}
