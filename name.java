import java.util.*;
public class name{
    public static void main(String args[]){
        //concatenation
        String FirstName = "Ujwal";
        String LastName = "Parashar";
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName.length());
        //charAt
        for(int i=0;i<FullName.length();i++){
            System.out.println(FullName.charAt(i));
        }
    }
}