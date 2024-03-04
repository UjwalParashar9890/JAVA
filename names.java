import java.util.*;
public class names{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int names[] = new int[size];

        //input
        for(int i=0;i<size;i++){
            names[i] = sc.nextInt();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.println(names[i]);
        }
    }
}