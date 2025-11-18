import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter any number (Enter 0 to exit): ");

int number = input.nextInt();
int largestNumber = 0;
int smallNumbers = 0;
int sentinel = 0;

while (number != sentinel) {
if (number > largestNumber) {
 largestNumber = number;
} else {
 smallNumbers = number;
}
System.out.print("Enter any number (Enter 0 to exit): ");
number = input.nextInt();
}

System.out.println("The largest number " + largestNumber);
System.out.println("The smallest numbers is " + smallNumbers);
}
}
