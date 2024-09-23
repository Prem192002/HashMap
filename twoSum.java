import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,8}; 
        int target = 12;
        int[] result=new int[2];
        //return the index of both the elements

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(target-arr[i])){
                mp.put(arr[i], i);
            }else{
                result[0]=i;
                result[1]=mp.get(target-arr[i]);
            }

        }
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
