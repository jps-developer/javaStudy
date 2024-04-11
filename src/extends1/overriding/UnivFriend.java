package extends1.overriding;

public class UnivFriend extends Friend{
    private String major;

    public UnivFriend(String name, String major, String phone) {
        super(name,phone);
        this.major = major;
    }
    
    public void showInfo(){
        super.showInfo();
        System.out.println("major = " + major);
    }
}
