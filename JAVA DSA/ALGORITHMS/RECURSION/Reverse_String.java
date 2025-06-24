import java.util.*;
public class Reverse_String 
{
    public static void main(String args[])
    {
        Scanner mg = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=mg.nextLine();
        System.out.println("String = "+ str);
        System.out.print("Reverse String = ");
        reverseString(str,str.length());
        mg.close();
    }    

    public static void reverseString(String str,int i)
    {
        if(i==0)                                  // Base case
            return;
        System.out.print(str.charAt(i-1));        // First print the (length-1) charecter i.e last one 
        reverseString(str, i-1);                  // Calls recursion func to pass the value of (i-1). Now i will point to 2nd last char and .....
    }
}

/*
OUTPUT

Enter the String
abcde

String = abcde
Reverse String = edcba

 */