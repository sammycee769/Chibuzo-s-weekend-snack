public class Palindrone {
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
