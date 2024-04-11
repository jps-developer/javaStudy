package interface2;

public class K2Car implements GassolineCar{

    int speed;
    int gass;

    public K2Car() {
        this.speed = 0;
        this.gass = 100;
    }

    @Override
    public void Accel() {
        gass -= 10;
        speed += 10;
    }

    @Override
    public void Break() {
        speed = 0;
    }

    @Override
    public void EnergyCharge() {
        System.out.println("휘발유 주유 완료");
        gass = 100;
    }
}
