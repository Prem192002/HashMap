import java.util.*;
public class maxFreq {
    public static void main(String[] args) {
        int[] arr = {1,5,4,3,6,2,1,5,2,1,1,9,5,5,2,5,5,9};
        int max = 0;
        int key=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        
        for(Map.Entry<Integer,Integer> val : mp.entrySet()){
            if(val.getValue()>max){
                max=val.getValue();
                key=val.getKey();
            }
        }

        System.err.println(key);
    }
}
