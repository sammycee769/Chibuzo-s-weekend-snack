public class Square {
public static boolean isSquare(int number){
int squareroot = (int) Math.sqrt(number); 
if (squareroot * squareroot == number)
return true;
else
return false;
}
}
