// problem link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/digit-frequency-official/ojquestion
import java.util.*;
import java.io.*;

public class DigitFrequency{
    public static void main(String [] args){
    
        List <Integer> list = Arrays.asList(1, 23, 52, 24, 53, 23,13,52,24,24,24);
       // System.out.print(list);
        Collections.sort(list);
        System.out.print(list);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < list.size() ; i++){
            int temp = list.get(i);
            int DigFreqOfTemp = 1;
            for(int j = i+1; j< list.size() ;j++){
                if(temp == list.get(j)){
                    DigFreqOfTemp+=1;
                }
                System.out.print(DigFreqOfTemp + " " + temp);
            }   
            map.put(temp, DigFreqOfTemp);
        }
        System.out.print(map);
    }
}