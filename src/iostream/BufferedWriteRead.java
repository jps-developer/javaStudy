package iostream;

import java.io.*;

public class BufferedWriteRead {
    public static void main(String[] args) {
        String ks = "3월11일 부터 시작이다.";
        String es = "Let's go !~";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))){
            bw.write(ks, 0, ks.length());
            bw.newLine();
            bw.write(es, 0, es.length());
        }
        catch(IOException e){
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader("String.txt"))){
            String str;

            while(true){
                str = br.readLine();
                if(str == null)
                    break;
                System.out.println(str);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
