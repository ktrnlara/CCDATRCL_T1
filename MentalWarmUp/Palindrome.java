/*Identifying if a string is a Palindrome or Not
add statement to count the number of characters in the entered string */

package MentalWarmUp;

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        
        System.out.println("Enter String: ");
        
        Scanner scan = new Scanner (System.in);
        

        String str = scan.nextLine();
        str = str.toLowerCase();// Converting to lowercase
        
        char [] ch = str.toCharArray();
        int num = 0;
        
        for ( int i = 0; i < ch.length / 2; i++){
            if (ch [i] != ch[ch.length - 1 - i]){
                num = 1; 
                break;
                
            }
        }
        
        if (num == 0){
            System.out.println(str + " is Palindrome");
            
        } else {
            System.out.println(str + " is not Palindrome");
        }
        
        // Number of characters in the entered string
        int charCount = str.length();
        System.out.println("Number of characters in the string: " + charCount);
        
    }
}
