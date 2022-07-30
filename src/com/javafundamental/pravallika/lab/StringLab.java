/**
 * 
 */
package com.javafundamental.pravallika.lab;

/**
 * @author Pravallika Kolluru
 */
public class StringLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = "bearbearbearcabearcatbebebear";
		String str = "bearcat";
		String str1 = "Northwest";
		System.out.println(str1.concat(" ").concat(r.substring(r.indexOf(str), r.indexOf(str) + str.length())));

		double myDouble = 64;
		System.out.println(Math.sqrt(myDouble));

		double myDouble1 = 2;
		double myDouble2 = 1;
		System.out.println(Math.sin(myDouble1));
		System.out.println(Math.sin(myDouble2));
		System.out.println(Math.tan(myDouble1));
		System.out.println(Math.tan(myDouble2));

		int myInt1 = 4;
		int myInt2 = 2;
		System.out.println(Math.pow(myInt1, myInt2));

	}

}
