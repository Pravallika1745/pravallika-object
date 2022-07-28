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
		
		String wizard = "Pravallika Kolluru";
		System.out.println(wizard.substring(0,wizard.indexOf(' ')));
	}

}
