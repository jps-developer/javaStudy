package oop;

public class Retangle {
    int height;
    int width;

    int Area()
    {
        return height * width;
    }
    int Perimeter(){
        return (2* height) + (2*width);
    }

    boolean Square(){
        return (height == width);
    }
}
