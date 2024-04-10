import java.util.Scanner;
public class MatrixAddition{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter no of rows");
		int rows=scanner.nextInt();
		System.out.println("enter no of columns");
		int columns=scanner.nextInt();
		int[][] matrix1=new int[rows][columns];
		int[][] matrix2=new int[rows][columns];	
		int[][] sumMatrix=new int[rows][columns];
		System.out.println("enter elements of row");
		enterMatrixElements(scanner,matrix1);
		System.out.println("enter elements of columns");
		enterMatrixElements(scanner,matrix2);
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("the sum =");
		printMatrix(sumMatrix);
	}
	public static void enterMatrixElements(Scanner scanner,int[][] matrix) {
		for (int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.println("enter element ["+i+"]["+j+"]:" );
				matrix[i][j]=scanner.nextInt();
			}
		}
	}
	public static void printMatrix(int[][] matrix) {
		for(int[] row:matrix) {
			for(int element:row) {
				System.out.println(element+" ");
				
			}
			System.out.println();
		}
	}
}