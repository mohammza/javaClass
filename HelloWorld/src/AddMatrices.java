import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[][] a;
		double[][] b;
		int row, column;
		
		//First Matrix
		System.out.print("Enter the dimensions of the first matrix: " );
		row = in.nextInt();
		column = in.nextInt();
		
		a = new double[row][column];
		System.out.print("Enter matrix1: " );

		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				a[i][j] = in.nextDouble();
			}
		}
		
		//Secnod matrix
		System.out.print("Enter the dimensions of the second matrix: " );
		row = in.nextInt();
		column = in.nextInt();
		
		b = new double[row][column];
		System.out.print("Enter matrix2: " );

		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				b[i][j] = in.nextDouble();
			}
		}
		
		if(a.length == b.length && a[0].length == b[0].length) {
			double[][] newMat = addMatrix(a,b);
			System.out.println("New matrix is: ");
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++) {
					System.out.print(newMat[i][j]+" ");
					if (j == a[i].length - 1)
						System.out.println();
				}
			}
		}
		else
			System.out.println("Two matrices must have the same dimnesions"
					+ " to be added together" );
		
		in.close();

	}

	public static double[][] addMatrix(double[][] a, double[][] b){
		int x = a.length;
		int y = a[0].length;
		double[][] arr = new double[x][y];
		for(int row = 0; row < a.length; row++) {
			for(int column = 0; column < a[row].length; column++) {
				arr[row][column] = a[row][column] + b[row][column];
			}
		}
		
		return arr;
	}
	
}
