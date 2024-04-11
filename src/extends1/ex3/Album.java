package extends1.ex3;

public class Album extends Item{
    String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    public void print(){
        super.print();
        System.out.println("아티스트 : " + artist);
    }
}
