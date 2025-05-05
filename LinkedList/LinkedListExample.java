public class LinkedListExample {

    int length = 0;
    Node head = new Node();
    Node tail = new Node();

    // create the Node class

    class Node {

        Node() {
        }

        private Node next;
        public Integer value;

        public Node(Integer value) {
            this.value = value;

        }

    }

    public LinkedListExample(int value) {

        Node node = new Node(1);
        head = node;
        tail = node;
        length = 1;

    }

    // Append
    public void Append(int value) {
        // create a New node using value
        Node newNode = new Node(value);

        // check if length is empty
        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            // point the tail.next to new Node
            tail.next = newNode;

            // change the tail to new Node
            tail = newNode;
        }
        length++;

    }

    public Node RemoveLastElement() {
        Node temp = head;
        Node pre = head;
        if (length == 0) {
            return null;
        } else {
            // declare temp and pre
            System.out.println(temp.value);
            while (temp.next != null) {
                // assign temp to pre
                pre = temp;
                temp = temp.next;
            }
            // point tail to pre and decrement the length
            tail = pre;
            tail.next = null;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
        }
        return temp;

    }

    public void printLL() {
        Node temp = head;
        while (null != temp) {
            System.out.println(temp.value);
            temp = temp.next;

        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;

        }
        length++;
    }

    public Node removeFirstElement() {
        // check the length
        if (length == 0) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            length--;
            if (length == 0) {

                tail = null;
            }
            return temp;
        }
    }

    public Node get(int index) {
        if (length == 0 || index < 0) {
            return null;

        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (null != temp) {
                return temp;
            } else {
                return null;
            }
        }
    }

    public boolean set(int index, int value) {
        if (length == 0 || index < 0 || index > length) {
            return false;
        } else {
            Node temp = get(index);
            if (null != temp) {
                temp.value = value;
                return true;
            }

        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length ) {
            return false;
        } else if (index == 0) {
            prepend(value);
            return true;

        } else if (length == 0) {
            Append(value);
            return true;
        } else {
            Node newNode = new Node(value);
            Node temp = get(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;

        }

    }

    public Node Remove(int index) {
        if (index <0 || index >length) {
             return null ;
        }else if (index==0) { 
            return removeFirstElement();
    
        }else if (index == length -1) {
             return RemoveLastElement();
        }else{
            Node prev = get(index-1);
            Node temp = prev.next;
          
            prev.next = temp.next;
            temp.next= null;
            length --;
            return temp ;

        }
    }

}