package extends1.overriding;

public class CompFriend extends Friend{
    private String department;

    public CompFriend(String name, String phone, String department) {
        super(name, phone);
        this.department = department;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("department = " + department);
    }
}
