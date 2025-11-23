public class Prime {
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
}

