package LaboratoryActivity1;


import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {

        Scanner scanner1 = new Scanner (System.in);
        
        System.out.println("Enter a Number: ");
        int number = scanner1.nextInt();
        	
        Scanner scanner2 = new Scanner (System.in);
        
        System.out.println("Enter a String: ");
        String string = scanner2.nextLine();
        
        
        scanner1.close();
        scanner2.close();
        
        
        Divisible divisible = new Divisible();
        divisible.isDivisibleByTwoOrThree(number);
        
        OddEven oddEven= new OddEven();
        oddEven.isEven(number);
        
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome(string);

	
	}
}

//class1
class Divisible {
	void isDivisibleByTwoOrThree(int number) {
		if(number % 2 == 0){
			System.out.println(number + " is Divisible by 2");

		}else if (number % 3 == 0){
			System.out.println(number + " is Divisible by 3");
			
        }else {
        	System.out.println(number + "The number is Divisible by 2 or 3");
        }
	}
}

//class2
class OddEven{
	
	void isEven(int number) {
        if (number % 2 != 0){
            System.out.println(number+ " is an Odd number");
        }else if (number % 2 == 0){
        	System.out.println(number+ " is an Even number");
        	
        }
	}
		
}

//class3
class Palindrome{
	void isPalindrome(String string) {
		string = string.toLowerCase().replaceAll("\\s+", "");
		
        char [] ch = string.toCharArray();
        int num = 0;
        
        for ( int i = 0; i < ch.length / 2; i++){
            if (ch [i] != ch[ch.length - 1 - i]){
                num = 1; 
                break;
            }
        }
        
        if (num == 0){
            System.out.println(string + " is Palindrome");
            
        } else {
            System.out.println(string + " is not Palindrome");
        }
	}
}
		   

