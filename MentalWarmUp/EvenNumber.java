/* Finding Even Numbers from [1-100]
Add statement Finding Odd Numbers from [1-100] */

package MentalWarmUp;

public class EvenNumber {
    public static void main(String[] args) {
        
        System.out.println("Even Numbers:");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        
        System.out.println("                                               ");
        
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}

