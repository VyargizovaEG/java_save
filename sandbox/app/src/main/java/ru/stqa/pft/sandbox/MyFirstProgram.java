package ru.stqa.pft.sandbox;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;


public class MyFirstProgram {


    public static void main(String[] args) {

        int a = 5;
        int h = (a * a) * 6;
        System.out.println("Площадь куба = " + h);


        Square s = new Square(5);
        System.out.println("S квадрата" + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


    }
}


