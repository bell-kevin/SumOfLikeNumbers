package sumoflikenumbers;

import java.util.Scanner;

public class SumOfLikeNumbers {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sum of Like Numbers by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        int i;
        int sum = 0;
        int max, num;
        String value;

        System.out.print("Please enter a number: ");
        max = computerKeyboardInput.nextInt();
        if (max % 2 == 0) {
            num = 2;
            value = "EVEN";
        } else {
            num = 1;
            value = "ODD";
        }
        for (i = num; i <= max; i += 2) {
            sum += i;
        }

        System.out.println("The sum of " + value + " numbers from 0 up to " + max + " is equal to: " + sum);
    }
}
