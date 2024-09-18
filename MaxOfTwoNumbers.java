import java.util.Scanner;

public class MaxOfTwoNumbers

{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input two numbers
        System.out.println("Enter the first number :");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        // find the maximum using the conditional ternary operator
        int max = (num1 > num2) ? num1 : num2;
        // output the result
        System.out.println("The maximum of the two numbers is :" + max);
        scanner.close();
    }
}