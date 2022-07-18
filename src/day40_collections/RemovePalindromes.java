package day40_collections;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        Iterator <String> it = names.iterator();

        //now when we have iterator we can get any element from the iterator

        while(it.hasNext()){
           String each = it.next();

           String reverse = ""; // declare new variable for reversed string which we will find in another loop bellow

           // nof check if element we get the element of is palindrome. So as soon we get the element we need dto reverse it for what we need another loop
            for (int i = each.length()- 1; i >= 0 ; i--) {
                reverse += each.charAt(i);

            }
            // compare strings
            if (each.equalsIgnoreCase(reverse)){
               // we can use remove method  names.remove(each);
                it.remove(); // must call remove method from it Iterator where all the elements are
            }
        }

        System.out.println(names);

        System.out.println("------------------------------------------------------------------------------------------");


        // here is the same task(removing palindrome by using lambda expression).

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        names2.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p));
        //  names2.removeIf( p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p) );

        System.out.println(names2);


    }
}
