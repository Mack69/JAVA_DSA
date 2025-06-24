import java.util.Scanner;

public class First_Last_Occurence_of_Char 
{
       public static int first=-1;
       public static  int last=-1;
    
       public static void Occurence(String str , char ch, int i)
       {
            if(i==str.length())           // BASE CASE    
            {
                System.out.println("First occurence = "+ first);    
                System.out.println("Last occurence = "+ last);
                return;
            }
            if(str.charAt(i)==ch)         // IF THE ELEMENT IS FOUND 
            {
                if(first==-1)             // THEN CHECKS WHETHER IT IS 1ST TIME OR NOT, IF 1ST TIME THEN CHANGE THE FIRST VALUE TO INDEX VALUE
                    first=i;
                else
                    last=i;               // OTHERWISE UPDATE THE LAST VALUE AS THIS INDEX 
            }
            Occurence(str, ch, i+1);      // INCREMENT THE INDEX VALUE FOR CHECKING NEXT CHAR
       }

       public static void main(String[] args) 
       {
        Scanner mg = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=mg.nextLine();
        System.out.println("Enter the Charecter");
        char ch=mg.next().charAt(0);
        Occurence(str,ch,0);
        mg.close();
       }

}

/*

OUTPUT

Enter the String
baabcabab
Enter the Charecter
a

First occurence = 1 (INDEX POSITION)
Last occurence = 7
 */