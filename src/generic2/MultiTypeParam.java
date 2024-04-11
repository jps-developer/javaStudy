package generic2;

class DBox<L, R>{
    private L left;
    private R right;

    public void set(L o, R r){
        left = o;
        right = r;
    }

    @Override
    public String toString(){
        return left + "&" + right;
    }
}

public class MultiTypeParam {
    public static void main(String[] args) {
        DBox<String, Integer> lBox = new DBox<>();
        DBox<String, Integer> rBox = new DBox<>();
        lBox.set("jae",3361);
        rBox.set("pil",191);

        DBox<DBox<String, Integer>, DBox<String, Integer>> ddBox = new DBox<>();
        ddBox.set(lBox,rBox);

        System.out.println(ddBox.toString().toString());
    }
}
