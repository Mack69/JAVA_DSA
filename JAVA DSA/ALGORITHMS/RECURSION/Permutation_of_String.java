public class Permutation_of_String     
{
    public static void main(String args[])
    {
        String str = "abc";
        Permutation(str,"");
    }
    
    public static void Permutation(String str, String permutation)
    {
        if(str.length()==0)
        {
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String newStr= str.substring(0,i) + str.substring(i+1);
            Permutation(newStr,permutation+ch);
        }
    }
}


/*
OUTPUT

abc
acb
bac
bca
cab
cba

 */