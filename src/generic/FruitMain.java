package generic;

public class FruitMain {
    public static void main(String[] args) {
        Box<Apple> aBox = new Box<>();
        Box<Orange> oBox = new Box<>();


        aBox.set(new Apple());
        oBox.set(new Orange());

        /*
        Apple ap = (Apple)aBox.get();
        Orange og = (Orange)oBox.get();

        System.out.println(ap);
        System.out.println(og);*/

        aBox.eating();
        oBox.eating();
    }
}
