import java.util.Scanner;

public class Numbers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter any number (Enter 1 to exit): ");

int number = input.nextInt();
int zeroCount = 0;
int negativeCount = 0;
int positiveCount = 0;
int sentinel = 1;

while (number != sentinel) {
if (number < 0) {
negativeCount++;
} else if (number > 0) {
positiveCount++;
} else if (number == 0) {
zeroCount++;
}
System.out.print("Enter any number (Enter 1 to exit): ");
number = input.nextInt();
}

System.out.println("Total Positive numbers: " + positiveCount);
System.out.println("Total Negative numbers: " + negativeCount);
System.out.println("Total Zero numbers: " + zeroCount);
}
}
