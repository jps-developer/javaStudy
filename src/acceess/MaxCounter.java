package acceess;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }

    public void increment(){
        if(!checkMaxCount()) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        countPlus();
    }
    public int getCount(){
        return copyCount();
    }
    private void countPlus(){
        count++;
    }
    private int copyCount(){
        return count;
    }
    private boolean checkMaxCount(){
        return max > count;
    }
}
