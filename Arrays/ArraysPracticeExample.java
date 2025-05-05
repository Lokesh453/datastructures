import java.util.*;
public class ArraysPracticeExample {

    public static void main(String[] args) {
        int noOfDays;
        
                // create scanner object and read input from User 
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days temperature u are looking for :: ");
        int sum =0 ;        
        noOfDays  = sc.nextInt();
        int[] arr = new int[noOfDays];

        for( int i=0; i<noOfDays; i++) {
            System.out.print("Day "+(i+1)+" temperature is ,");
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        double average = sum/noOfDays ;
        int above=0;

        // calculte how many days are abve the average temperature
        for( int i=0; i< arr.length ; i++ ) {
            if( arr[i] >=average ) {
                above++;
            }
        }
        System.out.println("Average  temperature of "+ noOfDays +" is :: "+ average);

        System.out.println("No of days above the average temp is: "+above);
    }
    
}
