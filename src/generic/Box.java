package generic;

/*public class Box {
    private Object ob;
    public void set(Object o){
        ob = o;
    }
    public Object get(){
        return ob;
    }
}*/
public class Box<T extends Eatable> {
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
    public void eating(){
        ob.eat();
    }
}