package interface1;

public interface ColorPrintable extends Printable{
    void ColorPrint(String doc);
    default void Color4kPrint(String doc) {};
}
