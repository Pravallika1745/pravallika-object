/**
 * 
 */
package com.javafundamental.pravallika;

/**
 * @author Pravallika Kolluru
 */
public class StringOperations2 {
	public static void main(String[] args) {
		String date = "03/05/2001";
		System.out.println(date.substring(0,2));
		System.out.println(date.substring(3,5));
		System.out.println(date.substring(6,10));
		
		String wizard = "Harry Potter";
		System.out.println(wizard.substring(0,wizard.indexOf(' ')));
		System.out.println(wizard.substring(wizard.indexOf(' ')+1));
		System.out.println(wizard.substring(wizard.indexOf(' ')+1).concat(", ").concat(wizard.substring(0,wizard.indexOf(' '))));
		System.out.println(wizard.substring(0,1)+(".")+wizard.substring(wizard.indexOf(' ')+1,wizard.indexOf(" ")+2));
	}

}
