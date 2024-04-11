import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car>{

    protected int disp;

    public Car(int d){
        disp = d;
    }

    @Override
    public String toString() {
        return "cc: " + disp;
    }

    @Override
    public int compareTo(Car o) {
        return disp - o.disp;
    }
}

class ECar extends Car {

    private int battery;

    public ECar(int d, int b) {
        super(d);
        battery = b;
    }

    @Override
    public String toString() {
        return "cc : " + disp + " ba : " + battery;
    }
}
    public class SortComparable{
        public static void main(String[] args) {
            List<ECar> list = new ArrayList<>();

            list.add(new ECar(1000,200));
            list.add(new ECar(4000,100));
            list.add(new ECar(3000,150));

            Collections.sort(list);

            for (ECar eCar : list) {
                System.out.println(eCar.toString());
            }
        }
    }


    // public static <T extends Comparable<? super T>> void sort(List<T> list)