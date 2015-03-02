package edu.upc.eetac.dsa.exercises.java.lang;

public class Tree {

	String nombre;
    int altura;
    
	public Tree(){
		//nombre = "";
		System.out.println( "Un arbol" );
	}
	public Tree(String name){
		nombre = name;
		System.out.println( "Un " + nombre);
	}
	public Tree(int heigh){
		altura = heigh;
		System.out.println( "Un arbol de " + altura + " metros" );
	}
	
	public Tree(int heigh, String name){
		nombre = name;
		altura = heigh;
		System.out.println( "Un " + nombre + " de " + altura + " metros" );

	}

}