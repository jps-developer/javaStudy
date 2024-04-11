package extends1.instaanceof;

class Box {
    public void simpleWrap() {
        System.out.println("Simple Wrapping");
    }
}

class PaperBox extends Box {
    public void paperWrap() {
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox {
    public void goldWrap() {
        System.out.println("Gold Wrapping");
    }
}



public class Wrapping {
    public static void main(String[] args) {
        Box box = new Box();
        PaperBox pBox = new PaperBox();
        GoldPaperBox gpBox = new GoldPaperBox();

        wrapBox(box);
        wrapBox(pBox);
        wrapBox(gpBox);

    }

    public static void wrapBox(Box b){
        if(b instanceof GoldPaperBox){  // b가 참조하는 인스턴스를 goldPaperBox로 형변환 할수있어?
            ((GoldPaperBox)b).goldWrap();;
        }
        if(b instanceof PaperBox){ // b가 참조하는 인스턴스를 PaperBox형 참조변수로 가르킬수있어?
            ((PaperBox)b).paperWrap();
        }
        if(b instanceof Box) {
            b.simpleWrap();
        }
    }
}
