package task1_string_manipulation;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequencyMap {

    public static void main(String[] args) {
        String s="automation";
        char[] arr=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:arr)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue()+" ");
        }
    }
}
