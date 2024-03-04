import java.util.*;
class sorting{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {3,7,8,9,4,1};
        int smallest =0;

        //selection sort
        for(int i=0;i<arr.length-1;i++){
            smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                smallest = j;
            }
        }
        int temp = arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
        printArray(arr);
}
}