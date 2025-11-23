public class Kata {

public static int subtract(int firstNumber, int secondNumber){
int result = firstNumber - secondNumber;
return Math.abs(result);
}
public static boolean isEven(int number){
if (number % 2 == 0)
return true;
else
return false;
}
public static float divide(int firstNumber, int secondNumber){
float result = (float) firstNumber / secondNumber;
if (firstNumber == 0 | secondNumber == 0){
return 0;
}else 
return result;
}
public static boolean isPrime(int number){
if(number < 2)
return false;

boolean isPrime = true; 
for (int divisor = 2; divisor <= number / 2; divisor++) {
if (number % divisor == 0) 
 isPrime = false;
break;
}

return isPrime;
}
public static boolean isSquare(int number){
int squareroot = (int) Math.sqrt(number); 
if (squareroot * squareroot == number)
return true;
else
return false;
}
public static long square(int number){
int result = number * number;
return result;
}
public static int factorsOf(int number){
int counter = 0;
for (int count = 1; count <= number ; count++){
    if (number % count == 0 ){
counter++; 
}
}
return counter;
}
public static long factorialOf(int number){
long counter = 1;
for (int count = 1; count <= number ; count++){
 counter = count * counter;
}
return counter;
}
public static boolean isPalindrone(int num){
int firstDigit = num / 10000;
int secondDigit = (num / 1000) % 10;
int thirdDigit = (num / 100) % 10;
int fourthDigit = (num / 10) % 10;
int fifthDigit = num % 10; 

if (firstDigit == fifthDigit && secondDigit == fourthDigit){
return true;
}
else
return false;
}
}
