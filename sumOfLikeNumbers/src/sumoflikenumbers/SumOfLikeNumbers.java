package sumoflikenumbers;

import java.util.Scanner;

public class SumOfLikeNumbers {

    public static void main(String[] args) {
        System.out.println("Sum of Like Numbers by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        int index, sum = 0, maximum, number;
        String characteristic;
        System.out.print("Please enter a number: ");
        maximum = computerKeyboardInput.nextInt();
        if (maximum % 2 == 0) {
            number = 2;
            characteristic = "EVEN";
        } else {
            number = 1;
            characteristic = "ODD";
        }
        for (index = number; index <= maximum; index += 2) {
            sum += index;
        }
        System.out.println("The sum of " + characteristic + " numbers is " + sum);
    }
}
