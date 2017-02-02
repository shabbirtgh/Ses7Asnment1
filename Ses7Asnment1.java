package myPack;

import java.util.Scanner;

public class Ses7Asnment1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value to convert to string : ");
		int k = sc.nextInt();
		String s = Integer.toString(k);
		System.out.println("Converted int data type "+k+" to String : "+s);
		
	}

}
