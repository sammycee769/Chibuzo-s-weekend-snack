import java.util.Scanner;
public class SquareOfNumbers{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer");
int number = input.nextInt();
long square = Kata.square(number);
System.out.printf("The square of %d is %d%n",number,square);

}
}
