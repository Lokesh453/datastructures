import java.util.*;
import java.io.*;
public class Example {

    public enum Days {
        SUN, Mon, tue, wed, thu, fri, sat
    }

    public static void main(String[] args) {
        String name = "Lokesh";
        String val = name.startsWith("L") ? "yes" : "no";
        switch (val) {
            case "yes":
                System.out.println("Yes name is started with L");
                break;
            default:
                System.out.println("Name is not started with L");

        }

        // loops
        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(" I value from For Loop is  :: " + i);
        }

        // while loop
        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {

                System.out.println("Even Number  from while loop  ::" + i);
            }
            i++;
        }

        // doWhile
        int j = 0;
        do {
            if (j % 2 == 1) {

                System.out.println("Odd number from do while loop is :: " + j);
            }
            j++;
        } while (j < 10);

        System.out.println(" switch example ");
        switchExample();
        Days[] days = Days.values();
        System.out.println(days);


        SwitchExampleWithScanner();
    }

    public static void switchExample() {
        char val = 'A';
        // write a pogram to identify the given char is vowel or not
        switch (val) {

            case 'a', 'e', 'i', 'o', 'u':
                System.out.println(" Given char is a vowel ");
                break;
            default:
                System.out.println("not a vowel");
        }

    }

    public static void SwitchExampleWithScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1. Print a message");
        System.out.println("2. Perform a calculation");
        System.out.println("3. Exit");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(" you have selected option 1 to print Hello message :: ");
                sc.nextLine();
                String message = sc.nextLine();
                System.out.println(message);
                break;
            case 2:
                System.out.println("You selected to perform a calculation.");
                System.out.println("Enter two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println("Sum: " + (num1 + num2));
                break;
            case 3:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");

        }
    }

}
