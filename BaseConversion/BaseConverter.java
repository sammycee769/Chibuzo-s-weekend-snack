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
public static String toBinary(int decimal){
if(decimal<0){
decimal = decimal * -1;
}
if(decimal==0){
return "0";
}
int division;
int multiple;
String remainder="";
String numb = "";

while(decimal != 0){
    division = decimal%2;
    multiple = decimal / 2;
    decimal = multiple;
//    System.out.print(division);

    numb+= division + "";
}

for(int count=numb.length()-1; count>=0;count--){
remainder+=numb.charAt(count);
}

return remainder;
}
}
