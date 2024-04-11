package static1;

public class Car {
    String carName;
    public static int count;

    public Car(String carName)
    {
        this.carName = carName;
        System.out.println("차량 구입, 이름 : " + carName);
        count++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 스 : " + count);
    }
}
