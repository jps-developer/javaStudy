package interface1;

public class SamsungPrinterDriver implements ColorPrintable{
    @Override
    public void print(String doc){
        System.out.println("Samsung printer : " + doc);
    }
    public void ColorPrint(String doc){
        System.out.println("Samsung Color printer : " + doc);
    }
}
