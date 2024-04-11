package generic3.extend;

public class UpperBoundedWildcard {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(123);

        Unboxer.peekBox(iBox);
    }
}
