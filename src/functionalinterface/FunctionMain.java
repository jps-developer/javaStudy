package functionalinterface;

import java.util.function.Function;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

class FunApply{
    public void func(int str){
        System.out.println("str = " + str);
    }
}


public class FunctionMain {

    public static void main(String[] args) {
        ToIntFunction<String> fun = s -> s.length();
        int len = fun.applyAsInt("ab cfdf");

        ToIntBiFunction<String, Integer> ff = (s, i) -> s.length() + i;

        FunApply f = new FunApply();
        f.func(ff.applyAsInt("sd",1));

        System.out.println("len = " + len);
    }
}
