
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
        if(i==str.length())
        {
            for(int k=0;k<count;k++)
                dup+='x';
            
            System.out.println(dup);
        }
        else
        {
            if(str.charAt(i)=='x')
                count++;
            else
                dup += str.charAt(i);
            
            charToEnd(str, i+1,count,dup);
        }
    }
}

// OUTPUT -> putting x at last 

// String = axbxdc
// Output = abdcxx