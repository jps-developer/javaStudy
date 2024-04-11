package acceess;

public class Tesla {
    private int speed;
    private String left;
    private String right;
    private int batteryRate;

    public Tesla(String left, String right) {
        this.left = left;
        this.right =right;
    }

    public void Excel(){
        SpeedUp();
    }
    public void Break(){
        SpeedDown();
    }
    private void SpeedUp(){
        speed += 10;
    }
    private void SpeedDown(){
        speed -= 10;
    }
}
