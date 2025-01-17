import java.util.*;
public class prac {
    public static void main(String[] args){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] arr = {2,5,4,7,2,5,5,0,10};
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }

        int firstmax=0;
        int secondmax = 0;
        int firstkey=0;
        int secondkey=0;
        for(Map.Entry<Integer,Integer> var : mp.entrySet()){
            if(var.getValue()>firstmax){
                secondmax=firstmax;
                secondkey=firstkey;
                firstmax=var.getValue();
               
                firstkey=var.getKey();
            }
        }

        System.out.println(secondkey);
    }
}
