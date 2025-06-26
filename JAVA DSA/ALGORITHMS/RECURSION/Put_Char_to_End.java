public class Put_Char_to_End 
{
    public static void main(String[] args) {
        
        String str="axbxdc";
        System.out.println("String = "+str);
        System.out.print("Output = ");
        charToEnd(str,0,0,"");
    }   

    public static void charToEnd(String str, int i, int count, String dup)
    {
        if(i==str.length())                    // Base Case
        {
            for(int k=0;k<count;k++)            // if whole string is traversed then add the no. of x element counted at the end of the new string.
                dup+='x';
            
            System.out.println(dup);            // print after adding x at the end
        }
        else
        {
            if(str.charAt(i)=='x')              // Checks for the Element X 
                count++;                         // if presents count the no. of Appearance
            else
                dup += str.charAt(i);            // if not then add the non-x element to the new string
            
            charToEnd(str, i+1,count,dup);        // update the index value to i -> i+1
        }
    }
}

// OUTPUT -> putting x at last 

// String = axbxdc
// Output = abdcxx