package extends1.overriding;

public class PhoneMain {
    public static void main(String[] args) {
        MobliePhone mp = new SmartPhone("3361", "14.1");
        SmartPhone sp = new SmartPhone("33161", "141.1");

        mp.answer();
        //mp.playApp(); 상위클래스 참조변수로 하위클래스를 참조할수는 있지만 하위클래스 메서드는 사용x
        sp.playApp();


        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;



    }
}
