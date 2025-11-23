public class Factorial {
public static long factorialOf(int number){
long counter = 1;
for (int count = 1; count <= number ; count++){
 counter = count * counter;
}
return counter;
}
}
