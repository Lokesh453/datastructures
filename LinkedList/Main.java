public class Main {

    public static void main(String[] args) {
        LinkedListExample linkedListExample = new LinkedListExample(1);
        linkedListExample.Append(2);
        linkedListExample.Append(3);
        LinkedListExample.Node removeValue = linkedListExample.RemoveLastElement();
        if (removeValue != null) {
            System.out.println("Removed Value is " + removeValue.value);
        }
        System.out.println("LinkedList before prepend ");
        linkedListExample.printLL();
        linkedListExample.prepend(10);
        System.out.println("LinkedList After prepend ");
        linkedListExample.printLL();

        // removing the first element 
        LinkedListExample.Node firstElement = linkedListExample.removeFirstElement();
        if (firstElement != null) {
            System.out.println("Removed Value is " + firstElement.value);
        }
        System.out.println("LinkedList After removing the first element  ");
        linkedListExample.printLL();

        System.out.println("Get value from specific index ::  "+linkedListExample.get(0).value);

        // Set method
        System.out.println("Set value from specific index ::  "+linkedListExample.set(0,21));
        linkedListExample.printLL();

        System.out.println("Adding elements in specific positions :: ");
        linkedListExample.insert(0,10);
        linkedListExample.insert(1, 11);
        linkedListExample.printLL();

        System.out.println("remove elements in specific index ");
        linkedListExample.Remove(0);
        linkedListExample.printLL();

    }

   

}