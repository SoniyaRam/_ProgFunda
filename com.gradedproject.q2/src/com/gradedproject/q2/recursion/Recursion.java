package com.gradedproject.q2.recursion;

import java.util.Scanner;

public class Recursion {
	
	public static int recursionMethod(int start, int end) {
		
		if(end==0) {
			return 1;
		}else if(end >0){
			return start*recursionMethod(start,(end-1));
		}else {
			return -1;
		}
		}
	    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base number x : ");
		int x = sc.nextInt();
		System.out.println("enter the power N :");
		int N = sc.nextInt();
		System.out.println(recursionMethod(x,N));

	}

}
