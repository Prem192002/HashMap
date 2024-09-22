import java.security.KeyStore.Entry;
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
        mp.putIfAbsent("rohan",20);
        System.out.println(mp);

        //get all keys in hashmap
        System.out.println(mp.keySet());

        //get all the values in the hashmap
        System.out.println(mp.values());
        
        //get all the entries in the hash map
        System.out.println(mp.entrySet());

        //iterating through the hashmap
            //through keys
        for(String key : mp.keySet()){
            System.out.println(key);
        }
            //through values
        for(Integer value : mp.values()){
            System.out.println(value);
        }
            //through all the entries
        for(Map.Entry<String,Integer> val : mp.entrySet()){
            System.out.println("My name is"+" "+val.getKey()+" "+"and i am "+" "+val.getValue()+" "+"years old");
        }
    }
    
}
