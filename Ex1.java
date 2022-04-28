
public class Ex1 {

	public static void main(String[] args) {
		int mat[][]= new int [5][5];
		int n = 5;
		int inicio = 0;
		int nlimite = n-1;
		int c= 1;
		
		while (c<=(n*n)) {
			for ( int i=inicio; i<=nlimite; i++) {
				mat[inicio][i] = c++;
			}
			for ( int i=inicio+1; i<=nlimite; i++) {
				mat[i][nlimite] = c++;
			}
			for ( int i=nlimite-1; i>=inicio; i--) {
				mat[nlimite][i] = c++;
			}
			for ( int i=nlimite-1; i>=inicio+1; i--) {
				mat[i][inicio] = c++;
			}
			inicio = inicio + 1;
			nlimite = nlimite - 1;
		}
		for ( int i=0; i<n; i++) {
			System.out.println();
			for ( int j=0; j<n; j++) {
				System.out.print(mat[i][j] + "\t");
			}
		}

	}

}
