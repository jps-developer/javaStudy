package lamda;

interface ShowString{
    void show();
}

interface ShowPara{
    void show2(int a);
}

interface ShowPara4{
    void show4(int a, int b);
}

interface ShowParaReturn{
    String show3(String s);
}

interface Predicate<T>{
    boolean test(T t);
}



public class LambdaMain {

    public static void main(String[] args) {

        ShowString show1 = () -> System.out.println("hello lambda");

        ShowPara show2 = a -> System.out.println(a + "para");

        ShowPara4 show4 = (a, b) -> System.out.println(a+b + " show4");

        ShowParaReturn show3 = s -> s + " show3";

        show1.show();
        show2.show2(4);
        String s = show3.show3("String");
        System.out.println(s);
        show4.show4(1,2);


        Predicate<Integer> pred = t -> {
            if(t > 10){
                System.out.println("10보다 크다.");
                return true;
            }else return false;
        };

        pred.test(9);

    }
}
