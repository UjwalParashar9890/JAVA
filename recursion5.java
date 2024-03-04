import java.util.*;
public class recursion5{
    public static void fibonacci(int a,int b,int n){
        if(n==0){      //base case as n is equals 0 code will stop
            return;
        }
        int c = a + b;  //calculating the next term
        System.out.println(c); //printing the next term
        fibonacci(b, c, n-1);  //calling the function for next terms when a=b and b=c and n-1 because we printed c previously
    }
    public static void main (String args[]){
        int a=0,b=1;               //printing a and b
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        fibonacci(a, b, n-2);       //n-2 bec we have printed a and b previously
    }
}