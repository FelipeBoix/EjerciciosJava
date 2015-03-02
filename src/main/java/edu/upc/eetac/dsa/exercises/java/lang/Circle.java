package edu.upc.eetac.dsa.exercises.java.lang;



public class Circle extends AbstractShape {
    double radio;

    public Circle(double radio) {
        super("circle");  // this.radio=radio;
        //this -> se utiliza cunado quiero hacer referencia a un objeto dentro de la misma clase.
        //super -> se utiliza cuando quiero hacer referencia a la clase que has extendido 
        // clase abstarcta -> es una clase que no puede crear objetos. Otras clases deben heredar de esta.
        //
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
