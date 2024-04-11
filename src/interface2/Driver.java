package interface2;

public class Driver {
    private Car car;

    public void setCar(Car car){
        System.out.println("자동차를 설정 합니다.");
        this.car = car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        car.Accel();
    }
    public void Stop(){
        System.out.println("자동차를 멈춥니다.");
        car.Break();
    }
    public void EnergyCharge(){
        System.out.println("연료를 공급 합니다.");
        car.EnergyCharge();
    }
    public void autoDriving(){
        System.out.println("자율 주행 모드 시작");
        car.autoDriving();
    }
}
