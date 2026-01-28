public class BaseConverter{
public static void main(String...args){
System.out.println(convertToBase("aa",11,2));
}
public static String convertToBase(String number, int initialBase, int finalBase){
    int decimal = toDecimal(number,initialBase);
    String result = toOtherBase(decimal,finalBase);
return result;
}
public static int toDecimal(String number, int base){

    number = number.toUpperCase();
int result = 0;
int powerOf = 1;
char character;
int digit;


    for(int count = number.length()-1; count>=0; count--){    
        character = number.charAt(count);                                                              

        if(character >= '0' && character <= '9'){
            digit = character - '0';
        }else{
            digit = character - 'A' + 10;
        }
        result += digit * powerOf;
        powerOf *= base;
        } 
return result;
}
public static String toOtherBase(int decimal, int base){
String result = "";
int remainder;
char digit;    

    if(decimal == 0){
        return "0";
    }

    while(decimal != 0){
        remainder = decimal % base;
        if(remainder < 10){
            digit = (char)(remainder + '0');
        }else{
            digit = (char)(remainder - 10 + 'A');
        }
        result = digit + result;
        decimal /= base;
    }

return result;
}

}



