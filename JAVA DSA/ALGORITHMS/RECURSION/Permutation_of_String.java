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


Permutation("ABC", "")
│
├─ i=0: 'A' → Permutation("BC", "A")
│  │
│  ├─ i=0: 'B' → Permutation("C", "AB")
│  │  │
│  │  └─ i=0: 'C' → Permutation("", "ABC") → PRINT "ABC"
│  │
│  └─ i=1: 'C' → Permutation("B", "AC")
│     │
│     └─ i=0: 'B' → Permutation("", "ACB") → PRINT "ACB"
│
├─ i=1: 'B' → Permutation("AC", "B")
│  │
│  ├─ i=0: 'A' → Permutation("C", "BA")
│  │  │
│  │  └─ i=0: 'C' → Permutation("", "BAC") → PRINT "BAC"
│  │
│  └─ i=1: 'C' → Permutation("A", "BC")
│     │
│     └─ i=0: 'A' → Permutation("", "BCA") → PRINT "BCA"
│ 
└─ i=2: 'C' → Permutation("AB", "C")
   │
   ├─ i=0: 'A' → Permutation("B", "CA")
   │  │
   │  └─ i=0: 'B' → Permutation("", "CAB") → PRINT "CAB"
   │
   └─ i=1: 'B' → Permutation("A", "CB")
      │
      └─ i=0: 'A' → Permutation("", "CBA") → PRINT "CBA"

Key Points to Remember:
Backtracking:

After printing "ABC", we "go back" to where we were (Permutation("C", "AB")) and try the next option.

This is how we explore all possible paths.

Loop Iteration:

At each step, the for loop lets us pick every possible remaining character one by one.

Order of Permutations:

The order depends on how we fix characters:

First fix 'A', then 'B', then 'C' → "ABC".

Then fix 'A', then 'C', then 'B' → "ACB".

Then fix 'B', then 'A', then 'C' → "BAC".

And so on.

 */