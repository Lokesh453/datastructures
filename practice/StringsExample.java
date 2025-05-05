import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class StringsExample {


    public static void main(String[] args) {
        // comparing Strings
        // 1 equals Method 
        String s1 = "Kohli";
        String s2 =  new String("kohli");
        String s3 = "Sachin";

        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));

        // equalsIgnoreCase 
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s2));

        // == operator 
        System.out.println(s1==s3);
        // compareTo method 
        System.out.println(s1.compareToIgnoreCase(s2));
        String s4= String.join(", ", s1,s2);
        System.out.println(s4);
        List<String> names = Arrays.asList("lokesh ", "Kumar", "Reddy ");
        String finValue = names.stream().collect(Collectors.joining("- "));
        
        System.out.println(finValue);

        // write a program to reverse each wiord in string 
        String name  = "Lokesh Kumar Reddy";
        char[] chararr = name.toCharArray();
        String rev = "" ;
        for ( int i= chararr.length-1; i>=0; i-- ) {
            rev+= chararr[i];
        }
        System.out.println(" rersed String " + rev);

    }
}