package com.java.lamdaexpression;

interface Addable{
    int addition(int a, int b);
}

interface Shape{
    void draw();
}
//class Rectangle implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("rectangle drwe");
//    }
//}
//class Square implements  Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("square drawing");
//    }
//}

class addittion implements Addable{

    @Override
    public int addition(int a, int b) {
        return a + b;
    }
}
public class LambdaExample {
    public static void main(String[] args) {
        Shape rectangle = ()->System.out.println("rectangle has been implemented");
        rectangle.draw();

        Addable add = ( a,  b)->(a + b);
        int result = add.addition(10,20);
        System.out.println(result);


    }

}
