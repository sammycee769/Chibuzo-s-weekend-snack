public class CreditcardFunction{
public static int lengthOfCreditCard(long carddetails){
int length = String.valueOf(carddetails).length();
return length;
}

public static boolean creditCardLengthIsValid(long cardDetails){
if(lengthOfCreditCard(cardDetails) >= 13 && lengthOfCreditCard(cardDetails) <= 16){
return true;
}
return false;
}
public static long[] converToArray (long cardDetails){
String card = String.valueOf(cardDetails);
long [] newArray = new long[card.length()];

for(int count = newArray.length-1;count>=0;count--){
newArray[count]=cardDetails % 10;
cardDetails/=10;
}
return newArray;
}
public static String cardType(long [] cardDetails){
//cardDetails = converToArray(cardDetails);
String cardType;
if (cardDetails[0] == 4){
cardType = "Visa Card";
}
else if(cardDetails[0] == 5){
cardType = "MasterCard";
}
else if(cardDetails[0] == 3 && cardDetails[1] == 7){
cardType = "American Express Card";
}
else if(cardDetails[0] == 6){
cardType = "Discover Card";
}
else{
cardType= "Invalid CardType";
}
return cardType;
}
public static long[] secondDigits(long [] cardDetails){
int length;
if(cardDetails.length % 2 == 0){
length = cardDetails.length/2 ;
}
else{
length = (cardDetails.length/2)+1;
}
long [] newArray = new long[length];

int counter = 0;
for(int count=cardDetails.length-2; count>=0 ;count-=2){
newArray[counter] = cardDetails[count];
counter++;
}
return newArray;
}
public static long[] sumOfDecondDigits(long [] digits){
long[] sumDigits = secondDigits(digits);
long [] newArray = new long[sumDigits.length];
for(int count=0;count<=sumDigits.length-1; count++){
newArray[count]=sumDigits[count]*2;
}
return newArray;
}
public static long[] removeDoubleDigits(long[] digits){
long[] sumDigits = sumOfDecondDigits(digits);
long [] newArray = new long[sumDigits.length];
for(int count=0;count<=sumDigits.length-1;count++){
if(sumDigits[count]>9){
newArray[count] = sumDigits[count]-9;
}else{
newArray[count] = sumDigits[count];
}
}
return newArray;
}
public static long addEvenDigits(long[] digits){
long[] sumDigits = removeDoubleDigits(digits);
long sum=0;
for(int count=0;count<sumDigits.length;count++){
sum+= sumDigits[count];
}
return sum;
}
public static long[] oddDigits(long [] cardDetails){
int length;
if(cardDetails.length % 2 == 0){
length = cardDetails.length/2 ;
}
else{
length = (cardDetails.length/2)+1;
}
long [] newArray = new long[length];

int counter = 0;
for(int count=cardDetails.length-1; count>=0 ;count-=2){
newArray[counter] = cardDetails[count];
counter++;
}
return newArray;
}
public static long addOddDigits(long[] digits){
long[] sumDigits = oddDigits(digits);
long sum=0;
for(int count=0;count<sumDigits.length;count++){
sum+= sumDigits[count];
}
return sum;
}
public static long sumOfResults(long[] digits){
long result = addOddDigits(digits)  + addEvenDigits(digits) ;
return result;
}
public static String isValid(long[] digits){
if (sumOfResults(digits)% 10 == 0 ){
return "Valid";
}
return"invalid";
}
}

