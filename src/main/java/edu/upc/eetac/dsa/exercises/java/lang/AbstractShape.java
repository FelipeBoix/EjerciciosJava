package edu.upc.eetac.dsa.exercises.java.lang;

public abstract class AbstractShape implements Shape {
    private String type;

    public AbstractShape(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "I'm a " + type;
    }

	public double area() {
		
		return 0;
	}
}