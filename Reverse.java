import java.util.*;
public class Reverse{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("ujwal");
        for(int i=0;i<sb.length()/2;i++){
            int front = i; // used for front index
            int back = sb.length()-1-i; // used for the back index

            char frontChar = sb.charAt(front); // just iterating the characters at the front positions
            char backChar = sb.charAt(back);  // just iterating the characters at the back positions

            sb.setCharAt(front, backChar); //just flipping the positions of the characters 
            sb.setCharAt(back, frontChar); //just flipping the positions of the characters
        }
        System.out.println(sb);
    }
}