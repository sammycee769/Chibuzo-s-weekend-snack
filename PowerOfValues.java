public class PowerOfValues {
public static void main(String[] args) {

int count = 1;
System.out.println("a       b       pow(a,b)");
while(count <= 5){
System.out.println(count + " \t" + (count + 1) +" \t" + (int)Math.pow(count,(count + 1)));
count++;
}
}
}
