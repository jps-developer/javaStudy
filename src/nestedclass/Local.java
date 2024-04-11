package nestedclass;

import interface1.Printable;

import java.lang.reflect.Parameter;

interface Pintable{
    void print();
}

class Paper{
    private String str;

    public Paper(String str) {
        this.str = str;
    }

    public Pintable getPrinter(){
        class Print implements Pintable{
            public void print(){
                System.out.println("str = " + str);
            }
        }
        return new Print();
    }
    public Pintable getPrinter2(){ // 익명클래스
        return new Pintable() {
            @Override
            public void print() {
                System.out.println(str);
            }
        };
    }

    public Pintable getPrinter3(){
        return new Print2();
    }

    // private선언으로 외부에서 클래스 생성을 막고 getPrinter3메서드로 호출한다
    private class Print2 implements Pintable{
        @Override
        public void print() {
            System.out.println("str = " + str);
        }
    }
}
public class Local {
    public static void main(String[] args) {
        Paper p = new Paper("nestes class");
        Pintable printer = p.getPrinter();

        printer.print();
        printer = p.getPrinter2();
        printer.print();
        printer = p.getPrinter3();
        printer.print();
    }
}
