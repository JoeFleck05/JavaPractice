//Objective 
//In this challenge, we're going to use loops to help us do some simple math.
//
//Task 
//Given an integer, , print its first  multiples. Each multiple  
//(where ) should be printed on a new line in the form: N x i = result.
//
//Input Format
//
//A single integer, .
//
//Constraints
// 2 <= N <= 20
//Output Format
// N x i = result

//Print  lines of output; each line  (where ) contains the  of  in the form: 
//N x i = result.

package JavaLoops1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops1 {

    public static void main(String[] args) {
        int N = 1;
 
        calculateIt(N);
    }
    
    private static void calculateIt(int number) {
    	Scanner in = new Scanner(System.in);
        int N = in.nextInt();
    	Integer result = 0;
    	if(2 <= N || N <= 20 ){
    		for(int i = 1 ; i <= 10 ; ++i){
        		// multiply result Answer
    			result = N * i;
    			System.out.println(N + " X " + i + " = " + result );
        	}
    	}
    }
}
