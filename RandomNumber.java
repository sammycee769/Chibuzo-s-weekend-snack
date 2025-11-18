import java.util.Scanner;
import java.util.Random;

public class RandomNumber{
public static void main(String [] args){
Random random = new Random();
Scanner input = new Scanner(System.in);

System.out.println("Guess a number between 1 and 50");
int randomNumber = random.nextInt(1,51);
int number = input.nextInt();
int guess = -1;
while(guess != number) {
System.out.println("Enter your guess");
guess = input.nextInt();

if(guess == number){
System.out.println("You guessed the number");
}
else if( guess > number ){
System.out.println("Your Number is higher");
}
else
System.out.println("Your guess is too low");
}
}
}
