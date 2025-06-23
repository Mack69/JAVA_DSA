import java.util.*;
public class Tower_of_Hanoi 
{
    public static void main(String args[])
    {
        Scanner mg = new Scanner(System.in);
        System.out.println("Enter the No. of Disk :");
        int n=mg.nextInt();
        System.out.println("Transfers of Disks : ");
        towerOfHanoi(n,"S","H","D");
        mg.close();
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest)
    {
        if(n==1)   // BASE CASE
        {  
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);  // If no. of Disk is 1 then direct Src to Destination
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);                                // recursive function for shifting (n-1) disk from (S -> H) where the Helper becomes Dest
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);     // Shifts nth disk direct (S -> D)
        towerOfHanoi(n-1, helper, src, dest);                                // recursive function for shifting remaining (n-1) disk from (H -> D) where the Helper becomes Source

    }
}

/*
OUTPUT

Enter the No. of Disk :
3

Transfers of Disks : 
Transfer disk 1 from S to D
Transfer disk 2 from S to H
Transfer disk 1 from D to H
Transfer disk 3 from S to D
Transfer disk 1 from H to S
Transfer disk 2 from H to D
Transfer disk 1 from S to D

 */