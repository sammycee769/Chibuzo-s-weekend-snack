import java.util.Scanner;
public class FactorialOfNumbers{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer");
int number = input.nextInt();
long factors = Kata.factorialOf(number);
System.out.printf("The factorial of %d is %d%n",number,factors);

}
}
