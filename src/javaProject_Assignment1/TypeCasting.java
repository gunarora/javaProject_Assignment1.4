
package javaProject_Assignment1;
//Import Scanner class for taking inputs from user
import java.util.Scanner;
public class TypeCasting {

	public static void main(String[] args) {
		byte byteVar; 
		short shortVar;
		int intVar;
		long longVar;
		float floatVar;
		double doubleVar;
		
		Scanner sc = new Scanner(System.in);
		//Enter byte value		
		System.out.println("Enter Byte number");
		//read value
		byteVar = sc.nextByte();
		//Enter Short value
		System.out.println("Enter Short number");
		//read value
		shortVar = sc.nextShort();
		//adding and save to int variable
		intVar = byteVar + (shortVar);
		System.out.println("Int sum is " + intVar);
		
		//o/p of int and short save to long variable
		longVar = shortVar + intVar; 
		System.out.println("Long sum is " + longVar);
		
		//o/p of int and long save to float variable
		floatVar = intVar + longVar;
		System.out.println("Float sum is " + floatVar);
		
		//o/p of float and long save to double variable
		doubleVar = longVar + floatVar;
		System.out.println("Double sum is " + doubleVar);
		
		sc.close();

	}

}
