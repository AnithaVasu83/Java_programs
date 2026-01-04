package task1_string_manipulation;

import java.util.Arrays;

public class ReverseStringWhileLoop {

    public static void main(String[] args) {
        String s = "Hello World";
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        char temp;
        while (left < right) {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        String reversed=new String(arr);
        //dont use Arrays.toString[arr]) is only for print the array like[d, l, r, o, W ,o, l, l, e, H]
        System.out.println("Reversed String: "+reversed);

    }
}
