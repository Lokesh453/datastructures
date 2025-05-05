import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

class FileOutputStramExample {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("test.txt");
            fout.write(65);

            String text = " Here is my sample text to write in to a file ";
            byte[] b = text.getBytes();
            fout.write(b);
            String text2 = " Here is my sample text to write in to a file ";
            byte[] b2 = text2.getBytes();
            fout.write(b2);
            String text3 = " Here is my sample text to write in to a file ";
            byte[] b3 = text3.getBytes();
            fout.write(b3);
            fout.close();

        } catch (Exception e) {
            System.out.println("Exception occurrred ");
        }

        // reading the data
        readDataFromAFile();
        writeWithBuffer();
        serializationExample();
     
    

    }

    public static void readDataFromAFile() {
        try {
            FileInputStream fs = new FileInputStream("test.txt");
            int data = 0;
            while ((data = fs.read()) != -1) {
                System.out.print((char) data);
                // System.out.println(data);
            }

        } catch (Exception e) {
            System.out.println("Exception occurrred ");
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            String line = "";
            while (br.readLine() != null) {
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            System.out.println("Exception ");
        }
        // using Buffered Reader

    }

    public static void writeWithBuffer() {
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test2.txt"));
            String text = "Hello from my programing language";
            byte[] b = text.getBytes();
            bos.write(b, 0, 5);
            bos.flush();
            bos.close();

        } catch (Exception e) {
            System.out.println("Exception occurrred while writing the files ");
        }
    }

    public static void serializationExample() {
        Student s1 = new Student("Mahesh", 10);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f.txt"));
            oos.writeObject(s1);
            oos.flush();
            oos.close();
        }catch(Exception e) {

        }

        // read the object from file 
        try {
            ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s2 = (Student)ooi.readObject();
            System.out.println(s2.getName() +" "+s2.getRollNum());
            ooi.close();
        }catch(Exception e) {

        }
     
      

    }
}