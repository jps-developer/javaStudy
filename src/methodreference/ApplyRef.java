package methodreference;

import java.util.function.ToIntBiFunction;

// 무조건 새롭게 정의한 것만 인스턴스 메소드 참조가능
class StringLen{
    private String name;

    public StringLen(String name) {
        this.name = name;
    }
    public int StringSum(String name){
        return this.name.length() + name.length();
    }
}


public class ApplyRef {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> toIntBiFunction = (s1, s2) -> s1.length() + s2.length();
        // int len = String:: 불가능

        //ToIntBiFunction<StringLen, String> toS = (s1, s2) -> s1.StringSum(s2);
        ToIntBiFunction<StringLen, String> toS = StringLen::StringSum;
        StringLen sl = new StringLen("abc");
        int sum = toS.applyAsInt(sl, "ab");
        System.out.println("sum = " + sum);
    }
}

// Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
// ==> Collections.sort(list, String::compareToIgnoreCase);