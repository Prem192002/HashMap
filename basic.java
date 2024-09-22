import java.util.*;
public class basic{
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>();
        //"put" method
        mp.put("prem",21);
        mp.put("anmol", 18);
        mp.put("rahul", 25);
        mp.put("rohan",20);

        System.out.println(mp.get("prem"));

        //updation is done using "put" method itself
        mp.put("prem", 22);

        //assessing is done using "get" method
        System.out.println(mp.get("prem"));

        //"remove" method
        System.out.println(mp.remove("rohan"));
        System.out.println(mp);

        //check if a key is present or not - "containsKey/Value"
        System.out.println(mp.containsKey("prem")); //true
        System.out.println(mp.containsKey("naman")); //false

        //insert only if key is not present
        
    }
    
}
