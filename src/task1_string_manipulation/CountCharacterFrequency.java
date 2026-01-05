package task1_string_manipulation;

public class CountCharacterFrequency {

    public static void main(String[] args) {
        String s="automation";
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            char c=s.charAt(i);
            for(int j=0;j<s.length();j++ )
            {
                if(s.charAt(j)==c)//For primitives (int, char, boolean, etc.):== checks value equality, i.e., whether the actual contents are equal.
                {
                    count++;
                }

            }
            System.out.println(c +" : " + count);
            //if we want to print only numbers in the place of character
            //System.out.print(count);
        }

    }
}
