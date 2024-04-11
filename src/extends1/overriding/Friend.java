package extends1.overriding;

public class Friend {
    String name;
    String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public  void showInfo(){
        System.out.println("name = " + name);
        System.out.println("phone = " + phone);
    }
}
