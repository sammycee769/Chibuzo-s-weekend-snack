public class Factors {
public static int factorsOf(int number){
int counter = 0;
for (int count = 1; count <= number ; count++){
    if (number % count == 0 ){
counter++; 
}
}
return counter;
}
}
