/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoflikenumbers;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class SumOfLikeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sum of Like Numbers by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        int i, number = 0, sum = 0;
        for (i = 0; number < 1; i++) {
            System.out.print("Please enter a number: ");
            number = computerKeyboardInput.nextInt();
            if (number < 0) {
                System.out.print("Good bye! \n");
                break;
            } else if (number % 2 == 0) {
                number = number + number;
                System.out.println("The sum of EVEN numbers is " + number);
            } else if (!(number % 2 == 0)) {
                number = sum + number;
                System.out.println("The sum of ODD numbers is " + sum);
            }
        }
    }
}
