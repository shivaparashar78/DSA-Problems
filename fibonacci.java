import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int a = 0;
      int b = 1;
      int i = 0;
      while(i < n){
          int c = a + b;
          System.out.println(a);
          a = b;
          b = c;
          i++;
      }
   }
  }