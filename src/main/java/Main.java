/* 6.5 (Sort three numbers) Write a method with the following header to display three numbers in increasing order:

public static void displaySortedNumbers(double num1, double num2, double num3)

Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.
*/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Prompt user to enter three numbers
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();  
    // Display the numbers in increasing order
    displaySortedNumbers(num1, num2, num3);
  }
  // Determine the order of the numbers and print them
  public static void displaySortedNumbers(double num1, double   num2, double num3) {
    if ((num1 <= num2 && num1 <= num3) && num2 <= num3) {
      System.out.println("The numbers in increasing order: " + num1 + " " + num2 + " " + num3);
    }
    else if ((num1 <= num2 && num1 <= num3) && num3 <= num2) {
      System.out.println("The numbers in increasing order: " + num1 + " " + num3 + " " + num2);
    }
    else if ((num2 <= num1 && num2 <= num3) && num1 <= num3) {
      System.out.println("The numbers in increasing order: " + num2 + " " + num1 + " " + num3);
    }
    else if ((num2 <= num1 && num2 <= num3) && num3 <= num1) {
      System.out.println("The numbers in increasing order: " + num2 + " " + num3 + " " + num1);
    }
    else if ((num3 <= num1 && num3 <= num2) && num1 <= num2) {
      System.out.println("The numbers in increasing order: " + num3 + " " + num1 + " " + num2);
    }
    else if ((num3 <= num1 && num3 <= num2) && num2 <= num1) {
      System.out.println("The numbers in increasing order: " + num3 + " " + num2 + " " + num1);
    }
  }
}

  
