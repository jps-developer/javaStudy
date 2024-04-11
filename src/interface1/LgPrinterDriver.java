package interface1;

public class LgPrinterDriver implements Printable{
    public void print(String doc){
        System.out.println("LG printer : " + doc);
    }
}
