import java.util.Scanner;

public class First_Last_Occurence_of_Char 
{
       public static int first=-1;
       public static  int last=-1;
    
       public static void Occurence(String str , char ch, int i)
       {
            if(i==str.length())
            {
                System.out.println("First occurence = "+ (first+1));
                System.out.println("Last occurence = "+ (last+1));
                return;
            }
            if(str.charAt(i)==ch)
            {
                if(first==-1)
                    first=i;
                else
                    last=i;
            }
            Occurence(str, ch, i+1);
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

First occurence = 2
Last occurence = 8
 */