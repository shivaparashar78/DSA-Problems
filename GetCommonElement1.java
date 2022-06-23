import java.io.*;
import java.util.*;

public class GetCommonElement1{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for(int i = 0 ; i < n1 ; i++){
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for(int i = 0 ; i < n2 ; i++){
            arr2[i] = scn.nextInt();
        } 

        //travel through array 1 and fill hashmap
        HashMap<Integer , Integer> fmap = new HashMap<>();
        for(int val : arr1){
            if(fmap.containsKey(val)){
                fmap.put(val , fmap.get(val) + 1);
            } else{
                fmap.put(val , 1);
            }
        }

        //travel through arr2 and remove from hashmap
        for(int val : arr2){
         if(fmap.containsKey(val)){
            System.out.println(val);
            fmap.remove(val);
         }      
        }
        

    }
}