package Recusrion;
public class Main {
    public static void main(String[] args) {
    	System.out.println(count8(8));
    	System.out.println(count8(818));
    	System.out.println(count8(8818));
    	
    	System.out.println(countHi2("xxhixx"));   
        System.out.println(countHi2("xhixhix"));  
        System.out.println(countHi2("hi"));  

        System.out.println(countHi2("ahixhi"));   
        System.out.println(countHi2("ahibhi"));  
        System.out.println(countHi2("xhixhi"));  
        
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(strCount("catcowcat", "dog"));
        
        System.out.println(stringClean("yyzzza"));
        System.out.println(stringClean("abbbcdd"));
        System.out.println(stringClean("Hello"));  
        
        
    }
    

    public static int count8(int number) {
        // Base case: if number is 0, there are no digits to check
        if (number == 0) {
            return 0;
        }

        // Check the last digit
        if (number % 10 == 8) {
            // If the digit before it is also 8, count double
            if ((number / 10) % 10 == 8) {
                return 2 + count8(number / 10);
            } else {
                // Otherwise, count this occurrence as 1
                return 1 + count8(number / 10);
            }
        }

        // Recursive call: continue with the next digit
        return count8(number / 10);
    }
    public static int countHi(String str) {
    	 // Base case: string length is less than 2 = hi can't appear
        if (str.length() < 2) {
            return 0;
        }
        
        // Check if first two letters of string are "hi"
        if (str.substring(0, 2).equals("hi")) {
            // Move the index by 2 --> avoid overlapping + recursion
            return 1 + countHi(str.substring(2));
        } else {
            // If not, Move the index by 1 if there is no match + recursion
            return countHi(str.substring(1));
        }
    }
    public static int countHi2(String str) {
   	 // Base case: string length is less than 2 = hi can't appear
    	if (str.length() < 2) {
            return 0;
        }
        
        // Check if first two letters of string are "hi"
        if (str.substring(0, 2).equals("hi")) {
            // Check if there is no x immediately before hi
            if (str.length() == 2 || str.charAt(0) != 'x') {
                // if not --> Move the index by 2 --> avoid overlapping + recursion
                return 1 + countHi2(str.substring(2));
            } else {
                // If so --> just Move the index by 1 if there is no match + recursion
                return countHi2(str.substring(1));
            }
        } else {
            // If not, Move the index by 1 if there is no match + recursion
            return countHi2(str.substring(1));
        }
     }
    public static int strCount(String str, String sub) {
    	// Base case: string length is less than sub = sub can't appear
    	if (str.length() < sub.length()) {
            return 0;
        }
    	 // Check if the  beginning matches the sub
        if (str.substring(0, sub.length()).equals(sub)) {
            // If so --> just Move the index by 1 if there is no match + recursion
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
          // If not, Move the index by 1 if there is no match + recursion
            return strCount(str.substring(1), sub);
        }
        
    }
    public static  String stringClean(String str) {
    	// Base case: string length is 1 or less = sub is cleaned or empty
    	if (str.length() <= 1) {
    		return str;
        }
    	// Checks if two characters that are next to each other have the same value
    	if(str.charAt(0) == str.charAt(1)) {
    		//If so --> return the second character + recursion  
    		return stringClean(str.substring(1));
    	}
    	else {
    		//if not --> return the first character + recursion 
    		return str.charAt(0) + stringClean(str.substring(1));
    	}
    }
    
 }