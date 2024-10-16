import java.util.*;
class test {
    public static void main(String[] args) {
        int range = 12;
        boolean[] arr=new boolean[range];
        arr[0]=false;
        arr[1]=false;
        for(int j=2;j*j<range;j++){
            for(int i=j;i<=(arr.length)/j;i++){

                arr[(i*j)-1]=true;
            }
    }
    int count =0;
    for(int i=1;i<arr.length;i++){
        if(arr[i]==false){
            count++;
        }
    }

    System.out.println(count);
    }
}