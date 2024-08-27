/*
 * Checkerboard
 * Niaz Baharudeen
 * 08/27/2024
 * Takes in an integer as input and prints to screen a checkerboard of
 * asterisks and spaces using the integer as the number of asterisks.
 * Each row is offset from the previous row.
 */
public class Checkerboard {

	public static void main(String[] args) {
		if(args.length < 1) { //Check the number of arguments
			System.out.println("Too few arguments");
			System.exit(0);
		}
		
		int dim = Integer.parseInt(args[0]);
		for(int j=0; j<dim; j++) {
			System.out.print("* ");
		}
	}

}
