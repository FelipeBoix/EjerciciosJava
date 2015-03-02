package edu.upc.eetac.dsa.exercises.java.lang;



public class Rectangle extends AbstractShape {
    int lado1;
    int lado2;

    public Rectangle(int lado1, int lado2) {
        super("rectangle");
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }
}
