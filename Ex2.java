import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int n = t.nextInt();
		int mat[][] = new int[n+1][n+1];
		
		for (int i=0; i<=n; i++) {
			for ( int j=0; j<=i; j++) {
				if ( j==0 || i==j) 
					mat[i][j]=1;
				else
					mat[i][j] = mat[i-1][j-1] + mat[i-1][j];
			}
		}
		
		for (int i=0; i<=n; i++) {
			for ( int j=0; j<=i; j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
