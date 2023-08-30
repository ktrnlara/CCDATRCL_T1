/* Finding numbers divisible by 3 & 5 from [1-100]
 Add statement Finding numbers divisible by 4 & 6 from [1-100] */

package MentalWarmUp;

public class Divisible {
    public static void main(String[] args) {
        
        System.out.println("Divisible by 3 & 5");
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }
        
        System.out.println("                                               ");
        
        System.out.println("Divisible by 4 & 6");
        for (int i = 1; i <= 100; i++){
            if(i % 4 == 0 && i % 6 == 0){
                System.out.println(i);
            }
        }
        
    }
}
