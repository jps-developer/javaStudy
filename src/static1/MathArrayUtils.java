package static1;

public class MathArrayUtils {

    private MathArrayUtils(){

    }

    public static int sum(int[] array){
        int sumOfArray = 0;
        for (int j : array) {
            sumOfArray += j;
        }
        return sumOfArray;
    }

    public static double average(int[] array){
        double averOfArray = 0;
        for (int i : array) {
            averOfArray += i;
        }
        return averOfArray / (array.length);
    }
}
