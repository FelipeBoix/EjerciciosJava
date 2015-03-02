package edu.upc.eetac.dsa.exercises.java.lang;

public class Principal3 {

	 public static void main(String[] args) {
	        /*if (args.length != 1) {
	            System.err.println("Program needs the path to the file with the numbers");
	            System.exit(-1);
	        }*/
		String path = "C:/Users/Felipe/dsa/EjerciciosJava/numeros.txt";

	        try {
	            double average = AverageCalculator.average(path);
	            System.out.println("Media = " + average);
	        } catch (FileParsingException e) {
	            e.printStackTrace();
	        } catch (BigNumberException e) {
	            e.printStackTrace();
	        }
	    }
}
