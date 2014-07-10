import java.io.*;
import java.util.Scanner;

/*
** Copyright © 2014 Michael Ingga Gunawan. All Rights Reserved. 
** Informatics Engineering / Computer Science
** Bandung Institute of Technology (ITB)
** michinggun@gmail.com
*/

public class main {
	
	//Inversion of Binary Input
	public static String inverse(String c){
		String temp="";
		
		for(int i=0;i<c.length();i++){
			if(c.charAt(i)=='0'){
				temp = temp + "1";
			}else{
				temp = temp + "0";
			}
		}
		return temp;
	}
	
	//Return Integer of Complement Result
	public static int getIntegerComplement(int N){
		String temp;
		int bin;
		if(N>=0 && N<=100000){
			temp = Integer.toBinaryString(N);
			//System.out.println("binary: " + temp);
			//System.out.println("complement: " + inverse(temp));
			bin = Integer.parseInt(inverse(temp),2);
		}else{
			bin = -9999;
			System.out.println("Please input 0 <= N <= 100000");
		}
		return bin;
	}
	
	public static void main(String[] args) { 
	      int i=0, j=0, input;
		  System.out.println("Veritrans Complement");
		  System.out.println("Please input -99 to exit");
	      Scanner scan = new Scanner(System.in);
	      System.out.print("Input #" + i + j + ": "); input = scan.nextInt();
	      while(input!=-99){
	    	  System.out.println("Output #" + i + j + ": " + getIntegerComplement(input));
	    	  j++;
	    	  if(j==10){
	    		  j=0;
	    		  i++;
	    	  }
	    	  System.out.println();
	    	  System.out.print("Input #" + i + j + ": "); input = scan.nextInt();
	      }
	      System.out.println("Goodbye :)");
	}
}
