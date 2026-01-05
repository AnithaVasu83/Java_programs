package task1_string_manipulation;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingMap {
    public static void main(String[] args) {
        String s="automation";
        boolean found=false;
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else map.put(ch,1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1)
            {
                System.out.println("second non repeating character: "+ entry.getKey());
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("No non repeating character");
        }
    }
}
