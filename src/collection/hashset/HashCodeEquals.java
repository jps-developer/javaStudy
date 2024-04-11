package collection.hashset;

import java.util.HashSet;
import java.util.Objects;

class Num{
    private int n;

    public Num(int n) {
        this.n = n;
    }
    
    @Override
    public String toString(){
        return String.valueOf(n);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(n);
    }
    @Override
    public boolean equals(Object obj){
        if(n == ((Num)obj).n)
            return true;
        else
            return false;
    }
}


public class HashCodeEquals {
    public static void main(String[] args) {
        HashSet<Num> set = new HashSet<>();
        Num n1 = new Num(124);
        set.add(new Num(123));
        set.add(new Num(123));
        set.add(n1);
        set.remove(n1);
        for (Num n  : set)
            System.out.println("n.toString() = " + n.toString());
    }
}
