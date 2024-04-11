package generic3.extend;

class Box<T>{
    private T o;

    public void set(T o){
        this.o = o;
    }

    public T get(){
        return o;
    }

    @Override
    public String toString() {
        return o.toString();
    }
}
