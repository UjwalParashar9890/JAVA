import java.util.*;
public class arraycc{
    public static int LinerSearch(int numbers[],int key) //building a function
    {
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={3,6,4,1,8,8,5};
        int key = 8;

        int index = LinerSearch(numbers,key); //calling the function and naming it as index
        if (index== -1) {
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index:"+ index);
        }
    }
}
