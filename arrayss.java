import java.util.*;
public class arrayss{
  public static int BinarySearch(int numbers[],int key){  // building up a function
    int start =0,end = numbers.length - 1;  //start from 0 till length-1 of an array
    while(start<=end){            //comprises of test case when start==end
      int mid = (start+end)/2;    //determining mid point
      
      if(numbers[mid]==key){       //mid is the key by anychance
        return mid;
      }
      if(numbers[mid]<key){         //right array in task 
        mid = mid + 1;              //updating mid of the array
      }
      else{
        end = end - 1;              // left array in task and updating end of the array
      }
    }
    return -1;                      //element not found
  }
  public static void main(String args[]){
    int numbers[] = {2,4,6,8,0,12,14};  //declaration of the array
    int key = 8;                        //declaration of the key
    System.out.println("index of the element is:"+BinarySearch(numbers,key));  //output print with calling the function
  }
}