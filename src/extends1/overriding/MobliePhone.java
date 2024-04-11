package extends1.overriding;

public class MobliePhone {

    protected String number;

    public MobliePhone(String num){
        number = num;
    }

    public SmartPhone answer(){
        System.out.println("My phon number is "+ number);
        return null;
    }
}
