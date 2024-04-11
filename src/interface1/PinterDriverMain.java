package interface1;

public class PinterDriverMain {
    public static void main(String[] args) {
        String myDoc = "Java implements";

        ColorPrintable sprn = new SamsungPrinterDriver();
        Printable lprn = new LgPrinterDriver();

        sprn.print(myDoc);
        lprn.print(myDoc);
        sprn.ColorPrint(myDoc);
    }
}
