
package avegareprogram;

import java.util.Scanner;


public class AvegareProgram {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numbers[] = new int[5];
        int sum = 0;
        for (int i =0; i<numbers.length;i++) {
            System.out.println("numbers[i]=");
            numbers[i]=keyboard.nextInt();
            sum +=numbers[i];
        }
        float average =(float)sum/numbers.length;
        System.out.println("Tbc=" +average);
    }
    
}
