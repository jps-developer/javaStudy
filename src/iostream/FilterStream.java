package iostream;

import java.io.*;

public class FilterStream {
    public static void main(String[] args) {
        try (DataOutputStream out =
                     new DataOutputStream(new FileOutputStream("data.txt"));
             DataInputStream in = new DataInputStream(new FileInputStream("data.txt"))){
            out.writeInt(101);
            out.writeDouble(2.14);

            int read1 = in.readInt();
            double read2 = in.readDouble();

            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        /*        try(DataInputStream in = new DataInputStream(new FileInputStream("data.txt"))){
            int read1 = in.readInt();
            double read2 = in.readDouble();

            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
        }
        catch(IOException e){
            e.printStackTrace();
        }*/
    }
}
