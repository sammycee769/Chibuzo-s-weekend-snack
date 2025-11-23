import java.util.Scanner;
public class FactorsofIntegers{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer");
int number = input.nextInt();
int factors = Kata.factorsOf(number);
System.out.printf("The factors of %d is %d%n",number,factors);

}
}
