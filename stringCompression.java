import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		String emp = "";
		char ch1 = str.charAt(0);
		emp += ch1;
        for(int i = 1 ;i < str.length() ; i++){
            char ch2 = str.charAt(i);
            if(ch1 != ch2){
				emp += ch2;
                ch1 = ch2;
            }
        }
		return emp;
		//if same as previous hai then skip
		// else add to the string 
	}

	public static String compression2(String str){
		int count = 1;
		String emp = "";
		char ch1 = str.charAt(0);
		emp += ch1;
		for(int i = 1 ; i < str.length() ; i++){
			char ch2 = str.charAt(i);
			if(ch1 == ch2){
				count++;
			} else {
				if(count > 1){
					emp+=count;
				}
				emp += ch2;
				ch1 = ch2;
				count = 1;
			}
		}
		if(count > 1){
			emp += count;
		}
		return emp;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}
}