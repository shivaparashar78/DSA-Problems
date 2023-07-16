import java.util.*;

public class findDuplicate{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }   
        //for sorting array
        Arrays.sort(arr);

        

        //for printing array
        for(int val: arr){
            System.out.print(val + " ");
        }
    }
}