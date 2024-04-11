package interface2;

public class ModelYCar implements ElecCar{

    int speed;
    int battery;
    boolean autoDrive;

    public ModelYCar() {
        speed = 0;
        autoDrive = true;
        battery = 100;
    }

    @Override
    public void Accel() {
        battery -= 10;
        speed += 10;
    }

    @Override
    public void Break() {
        speed = 0;
    }

    @Override
    public void EnergyCharge() {
        System.out.println("배터리 충전 완료");
        battery = 100;
    }

    public void autoDriving(){
        System.out.println("자율 주행 모드 ");
    }
}
