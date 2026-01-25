public class BaseConverter{
public static void main(String...args){
System.out.println(toDecimal(101));
}
public static int toDecimal(int binary){
if(binary<0){
binary *= -1;
}
if(binary==0){
return 0;
}
    String decimalNumber = binary+ "";
    int decimalResult = 0;

    for(int count = 0;count<decimalNumber.length();count++){    
        decimalResult += (binary%10)*Math.pow(2,count);
        binary/=10;
    }
    return decimalResult;
}

}
