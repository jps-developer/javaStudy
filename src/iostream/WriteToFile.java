package iostream;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

/*        try(OutputStream outputStream = new FileOutputStream("data.txt")){
            outputStream.write(10);
        }
        catch(IOException e){
            e.printStackTrace();
        }*/
        try(InputStream inputStream = new FileInputStream("data.txt")){
            int data = inputStream.read();
            System.out.println("data = " + data);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
