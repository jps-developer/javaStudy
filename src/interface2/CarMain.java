package interface2;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car k2Car = new K2Car();
        driver.setCar(k2Car);

        driver.drive();
        driver.EnergyCharge();
        driver.Stop();
        driver.autoDriving();

        Car YCar = new ModelYCar();
        driver.setCar(YCar);
        driver.autoDriving();
    }
}
