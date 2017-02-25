import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
            int Alice =0;
	        int Bob=0;
	        	if(a0>b0)
	        	Alice++;
	        	if(a1>b1)
	        	Alice++;
	        	if(a2>b2)
	        	Alice++;
	        	if(b0>a0)
	        		Bob++;
	        	if(b1>a1)
	        		Bob++;
	        	if(b2>a2)
	        		Bob++;
	        
		System.out.printf("%d %d",Alice,Bob);
	
    }
}