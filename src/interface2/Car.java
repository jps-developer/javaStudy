package interface2;

public interface Car {
    void Accel();
    void Break();
    void EnergyCharge();
    default void autoDriving(){};
}
