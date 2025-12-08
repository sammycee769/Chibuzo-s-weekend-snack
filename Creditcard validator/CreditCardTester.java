import java.util.Arrays;
import java.util.Scanner;
public class CreditCardTester{
public static void main(String[]args){
Scanner input = new Scanner(System.in); 
System.out.println("Hello, Kindly Enter Card details to Verify");
long userInput= input.nextLong(); 

long [] cardNum =CreditcardFunction.converToArray(userInput);


     System.out.println("**********");
     System.out.println("**Credit Card Type: "+CreditcardFunction.cardType(cardNum));
     System.out.println("**Credit Card Number: "+userInput);
     System.out.println("**Credit Card Digit Lenght: "+CreditcardFunction.lengthOfCreditCard(userInput));
     System.out.println("**Credit Card Validity Status: "+CreditcardFunction.isValid(cardNum));    
     System.out.println("**********");
} 

}

