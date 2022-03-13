package Assignments;

import java.util.Arrays;

public class Session6_Assignment1 {
	
	public static void main(String args[]) {
		StringBuffer stbuff = new StringBuffer("Sajan Kumar Singh");
		
        //to check the character in an index
		
		System.out.println(stbuff.charAt(2));
		
		System.out.println(stbuff.capacity());// by default capacity is 33
		
		stbuff.ensureCapacity(40);
		
		System.out.println(stbuff.capacity());// now capacity has increased to 68
		
		System.out.println(stbuff);
		
		stbuff.appendCodePoint(65);//this will append real value of ascii code 65 i.e. 'A' at the end of the String
		
		System.out.println(stbuff);
		
		stbuff.appendCodePoint(100);//this will append real value of ascii code 65 i.e. 'd' at the end of the String
		
		System.out.println(stbuff);
		
		int code=stbuff.codePointAt(9);//it will store the unicode of character to that index
		
		System.out.println(code);
		
		// to convert string into character of arrays
		
		char[] array = new char[15];
		  
        Arrays.fill(array, '.');
  
        stbuff.getChars(0, 11, array, 1);//get the values from string buffer object and put it in array of characters
  
        System.out.print("char array contains : ");
  
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("String = "+ stbuff.toString());

		stbuff.setCharAt(7, 'U');// set char at index 4 to '0'

		System.out.println("After setCharAt() String = "+ stbuff.toString());
		
		stbuff.insert(5, "for");// insert for from index 5. Here int double boolean float values can be added as well
        System.out.println(stbuff);
 
        stbuff.insert(0, 5);//insert 5 at starting index
        System.out.println(stbuff);
 
        System.out.println(stbuff.reverse());// to reverse the string
        System.out.println(stbuff.reverse());// to again reverse and make it normal
        
        System.out.println(stbuff.delete(6, 9));// to delete certain range
        System.out.println(stbuff.deleteCharAt(0));
        System.out.println(stbuff.delete(17, 19));
        
        System.out.println(stbuff.replace(7, 8, "u"));
	}

}
