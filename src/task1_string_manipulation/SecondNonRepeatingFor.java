package task1_string_manipulation;

public class SecondNonRepeatingFor {
    public static void main(String[] args) {
        String s = "automation";
        boolean found = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && ch == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
                if (count == 2) {

                    System.out.println("Second non repeating character: " + ch);
                    found = true;
                    break;
                }
            }
        }

        if(!found)
    {
        System.out.println("no repeating characters");
    }
    }
}
