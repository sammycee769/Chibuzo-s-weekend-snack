import java.util.Scanner;
public class TwelveDaysOfChristmas{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
menu:while(true){
    String menu = """
        1.On the first day of Christmas
        My true love gave to me
        A partridge in a pear tree.

        2.On the second day of Christmas
        My true love gave to me
        Two turtle doves
        And a partridge in a pear tree.

        3.On the third day of Christmas
        My true love gave to me
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.

        4.On the fourth day of Christmas
        My true love gave to me
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.

        5.On the fifth day of Christmas
        My true love gave to me
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.

        6.On the sixth day of Christmas
        My true love gave to me
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.

        7.On the seventh day of Christmas
        My true love gave to me
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.

        8.On the eighth day of Christmas
        My true love gave to me
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.

        9.On the ninth day of Christmas
        My true love gave to me
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.

        10.On the tenth day of Christmas
        My true love gave to me
        Ten lords a-leaping,
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.

        11.On the eleventh day of Christmas
        My true love gave to me
        Eleven pipers piping,
        Ten lords a-leaping,
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.

        12.On the twelfth day of Christmas
        My true love gave to me
        Twelve drummers drumming,
        Eleven pipers piping,
        Ten lords a-leaping,
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.
        0.Exit
        """;
System.out.print(menu);
System.out.println("Enter an option: ");
int firstDay = input.nextInt();
switch(firstDay){
case 1->{System.out.println("""
        On the first day of Christmas
        My true love gave to me
        A partridge in a pear tree.
        """)

;}
case 2->{System.out.println("""
        On the second day of Christmas
        My true love gave to me
        Two turtle doves
        And a partridge in a pear tree.
        """);
}
case 3->{System.out.println("""
        On the third day of Christmas
        My true love gave to me
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.
        """);
}
case 4->{System.out.println("""
        On the fourth day of Christmas
        My true love gave to me
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.
        """);}
case 5->{System.out.println("""
        On the fifth day of Christmas
        My true love gave to me
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.
        """);
}
case 6->{System.out.println("""
        On the sixth day of Christmas
        My true love gave to me
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.
        """);}
case 7->{System.out.println("""
        On the seventh day of Christmas
        My true love gave to me
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.""")
;}
case 8->{System.out.println("""
        On the eighth day of Christmas
        My true love gave to me
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves    
        And a partridge in a pear tree.
        """);
}
case 9->{System.out.println("""
        On the ninth day of Christmas
        My true love gave to me
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.
        """);
}
case 10->{System.out.println("""
        On the tenth day of Christmas
        My true love gave to me
        Ten lords a-leaping,
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.
        """);
}
case 11->{System.out.println("""
        On the eleventh day of Christmas
        My true love gave to me
        Eleven pipers piping,
        Ten lords a-leaping,
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.
        """);
}
case 12->{System.out.println("""
        On the twelfth day of Christmas
        My true love gave to me
        Twelve drummers drumming,
        Eleven pipers piping,
        Ten lords a-leaping,
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves
        And a partridge in a pear tree.
        """);
}
case 0->{System.out.println("Exiting.........")}
}
} 
}
}
