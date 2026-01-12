

import java.util.Scanner;


class Esercizio {

    static Scanner input = new Scanner(System.in);
    
 
    static boolean inserisciInGriglia(String[][] G, int i, int j, String s) {
		i--;
		j--;

		if (i >= 0 && i < 3 && j >= 0 && j < 3) {
			if (G[i][j].equals("-")) {
				G[i][j] = s;
				return true;
			}
		}
		return false;
	}


   
    static void azzeraGriglia(String[][] G, int n, int m) {
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++) {
				G[r][c] = "-";
			}
		}
	}


 
    static boolean controllaVincita(String[][] G, String s) {

		if (
			// righe
			(G[0][0].equals(s) && G[0][1].equals(s) && G[0][2].equals(s)) ||
			(G[1][0].equals(s) && G[1][1].equals(s) && G[1][2].equals(s)) ||
			(G[2][0].equals(s) && G[2][1].equals(s) && G[2][2].equals(s)) ||

			// colonne
			(G[0][0].equals(s) && G[1][0].equals(s) && G[2][0].equals(s)) ||
			(G[0][1].equals(s) && G[1][1].equals(s) && G[2][1].equals(s)) ||
			(G[0][2].equals(s) && G[1][2].equals(s) && G[2][2].equals(s)) ||

			// diagonali
			(G[0][0].equals(s) && G[1][1].equals(s) && G[2][2].equals(s)) ||
			(G[0][2].equals(s) && G[1][1].equals(s) && G[2][0].equals(s))
		) {
			return true;
		}

		return false;
	}


  
    static int contaCaselleLibere(/scrivere qui i parametri richiesti dall'esercizio/ ) {
        //SCRIVERE QUI IL CODICE RICHIESTO DALL'ESERCIZIO
    }


    public static void main(String args[]) {
       
    }
}

