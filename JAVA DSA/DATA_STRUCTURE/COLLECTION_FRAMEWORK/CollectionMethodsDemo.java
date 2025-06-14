import java.util.*;
public class CollectionMethodsDemo {
    public static void main(String[] args) {
        
        Collection<Integer> arr= new ArrayList<>();   // Declaring a collection as an ArrayListy
        arr.add(8);
        arr.add(9);
        System.out.println(arr);

        Collection<Integer> num= new ArrayList<>();
        arr.add(7);
        arr.add(6);                          // add()

        num.addAll(arr);                       // addAll()
        System.out.println(num);
       
        System.out.println(num.size());        // size()
        System.out.println(num.isEmpty());     // isEmpty()

        num.remove(7);                       // remove()
        System.out.println(num);

        System.out.println(num.contains(7));  // contains()

    }
}
