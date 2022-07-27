package com.javafundamental.pravallika;
/**
 * @author Pravallika Kolluru
 */
public class stringOperations {
	public static void main(String[] args) {
		String r = new String("I Love Java");
		String s = new String("Jumping Jeroos");
		String t = new String("bearcat");
		String u = new String("northwest");
		System.out.println(t.toUpperCase());
		System.out.println(r.toLowerCase());
		System.out.println(u.length());
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(u.concat(t));
		System.out.println(u.concat("Missouri"));
		System.out.println("Hopping".concat(" Jeroos"));
		System.out.println("computer".concat(" science"));
		System.out.println(t + " football");
		System.out.println(r.indexOf("Love"));
		System.out.println(s.indexOf("Jump"));
		System.out.println(t.indexOf("cat"));
		System.out.println(u.indexOf("dog"));
		System.out.println(u.substring(5));
		System.out.println(u.substring(1, 3));
		System.out.println(r.substring(3));
		System.out.println(s.substring(0, 3));
	}

}
