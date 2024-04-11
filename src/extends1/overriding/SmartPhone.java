package extends1.overriding;

public class SmartPhone extends MobliePhone{

    private String androidVer;

    public SmartPhone(String number, String androidVer){
        super(number);
        this.androidVer = androidVer;
    }
    public void playApp(){
        System.out.println("App is runnint in " + androidVer);
    }
}
