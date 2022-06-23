import java.util.*;

public class hfc{
    public static void main(String [] args){
        String str = "zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc";
        HashMap<Character , Integer> fmap = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(fmap.containsKey(ch)){
                fmap.put(ch , fmap.get(ch) + 1);
            } else {
                fmap.put(ch , 1);
            }
        }

       Set<Character> keys = fmap.keySet();
       char hfc = str.charAt(0);
       for(char ch : keys){
        if(fmap.get(ch) > fmap.get(hfc)){
            hfc = ch;
        }
       }
       System.out.println(hfc);
    }
}