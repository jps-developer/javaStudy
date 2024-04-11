interface Ex{
  int pulsOne();
}

class Ex2 implements Ex{
    public int pulsOne(){
        return 10;
    }
}

class Ex3 extends Ex2{
    void show(){
        System.out.println("Ex3");
    }
}


class Main{
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        System.out.println(ex2.pulsOne());
    }

}