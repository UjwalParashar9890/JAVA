import java.util.*;
public class Ujwal{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        //input
        //rows
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if((j+i*cols)!=0){
                if((j+i*cols)%2==0){
                    System.out.println(numbers[i][j]);           
                }
            }
        }
        }
    }
}