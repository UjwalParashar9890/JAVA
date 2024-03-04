import java.util.*;
public class largest{
    public static int getLargest(int numbers[]) //made a function
    {
        int largest = Integer.MIN_VALUE; // -infinity in java
        for(int i=0;i<numbers.length;i++){
            if (largest<numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {3,5,7,8,19};
        System.out.println("largest number is:" + getLargest(numbers));
    }
}
