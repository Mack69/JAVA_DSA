import java.util.*;
public class ArrayListMethods {
    
    public static void main(String[] args) {
        
        List <Integer> list1 = new ArrayList<>();     // Declaring ArrayList as a generalised List

        for(int i =1;i<=5;i++)
        {
            list1.add(i);
        }
        System.out.println(list1);

        list1.add(5);                                //add()

        System.out.println(list1);
        System.out.println(list1.get(2));        //get()
        System.out.println(list1.indexOf(5));        //indexOf()          
        list1.set(5, 6);                 // set()
        System.out.println(list1);
        
        // Storing different datatypes in a ArrayList

        List list2 = new ArrayList<>();
        list2.add(String.valueOf("Mayukh"));        //Storing the value as String
        list2.add(22);
        list2.add(String.valueOf("Kolkata"));
        System.out.println(list2);
        
    }
}
