package sumoflikenumbers;

import java.util.Scanner;

public class SumOfLikeNumbers {

    public static void main(String[] args) {
        System.out.println("Sum of Like Numbers by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        int index, sum = 0, maximum, number;
        String value;
        System.out.print("Please enter a number: ");
        maximum = computerKeyboardInput.nextInt();
        if (maximum % 2 == 0) {
            num = 2;
            value = "EVEN";
        } else {
            number = 1;
            value = "ODD";
        }
        for (index = number; index <= maximum; index += 2) {
            sum += index;
        }
        System.out.println("The sum of " + value + " numbers is " + sum);
    }
}
