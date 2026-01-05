package task1_string_manipulation;

public class AllNonRepeatingCharacterFor {
    public static void main(String[] args) {
        String s="automation";
        boolean found=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean isUnique=true;
            for(int j=0;j<s.length();j++){
                if(i!=j && ch==s.charAt(j)){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique)
            {
                System.out.println("non repeating character: "+ch);
                found=true;
            }
        }
        if(!found)
        {
            System.out.println("no non repeating characters");
        }
    }
}
