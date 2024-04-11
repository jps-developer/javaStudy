package extends1.ex2;

public class BusinessMan extends Man{
    String company;
    String position;
    public BusinessMan(String name, String company, String posiotion){
        super(name);
        this.company = company;
        this.position = posiotion;
    }
    public void tellYourInfo(){
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        tellYourName();
    }
}
