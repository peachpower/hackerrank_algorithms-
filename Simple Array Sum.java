/* Problem
	Input Format
	The first line contains an integer,N, denoting the size of the array. 
	The second line contains N space-separated integers representing the array's elements.

	Output Format
	Print the sum of the array's elements as a single integer.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //size
        int arr[] = new int[n]; // making array of size n
        for(int arr_i=0; arr_i < n; arr_i++){ //initializing for loop
            arr[arr_i] = in.nextInt(); //initializing array with those numbers
            sum = sum + arr[arr_i];
        }
        System.out.println(sum);
    }
}