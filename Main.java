import java.util.Scanner;
/**
 * Fizz buzz game
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Ask the user for a number
    System.out.println("Please enter a number to play FizzBuzz");

    // Gets the users input
    int num = input.nextInt();

    // Gets the number and divides it by 3
    double numFizz = num % 3;

    // Get the number and divides it by 5
    double numBuzz = num % 5;

    // tells the user what they have to say according to the number that they chose
    if (numFizz == 0 && numBuzz ==0){
      System.out.println("You should say FizzBuzz");
    } else if (numFizz == 0){
      System.out.println("You should say Fizz");
    } else if (numBuzz == 0){
      System.out.println("You should say Buzz");
    } else {
      System.out.println("You should say " + num);
    }
    
  }
}
