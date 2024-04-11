package extends1.ex1;

public class GassCar extends Car{

    String carNum;

    public GassCar(int  gasoline, String carNum){
        super(gasoline);
        this.carNum = carNum;
    }

    public void move(){
        System.out.println("차를 이동 합니다.");
    }

    public void fillUp(){
        System.out.println("차를 주유 합니다.");
    }
}
