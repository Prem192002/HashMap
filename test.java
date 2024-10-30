import java.util.*;
class test {
    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
    // gcd of 2 numbers
    int a = 10;
    int b= 25;

    test obj = new test();
    System.out.println(obj.gcd(a,b));



   

    }
}