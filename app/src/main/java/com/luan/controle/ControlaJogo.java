package com.luan.controle;

public class ControlaJogo {
	private static int[][] matriz =   {{0,0,0},
                                       {0,0,0},
                                       {0,0,0}};


	public static void atualizaCampo(int linha, int coluna, int valor) {
		matriz[linha][coluna] = valor ;
	}
	
	public static int verificaGanhador(){
		
		if( (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1 ) ||
		    (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 ) ||
		    (matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 1 ) ||
		    (matriz[2][0] == 1 && matriz[2][1] == 1 && matriz[2][2] == 1 ) ||
		    (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 ) ||
		    (matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1 ) ||
		    (matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][0] == 1 ) ||
		    (matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 ) ){
			
			return 1;
		}
		
		if( (matriz[0][0] == 2 && matriz[0][1] == 2 && matriz[0][2] == 2 ) ||
		    (matriz[0][0] == 2 && matriz[1][0] == 2 && matriz[2][0] == 2 ) ||
		    (matriz[0][0] == 2 && matriz[1][1] == 2 && matriz[2][2] == 2 ) ||
		    (matriz[2][0] == 2 && matriz[2][1] == 2 && matriz[2][2] == 2 ) ||
		    (matriz[1][0] == 2 && matriz[1][1] == 2 && matriz[1][2] == 2 ) ||
		    (matriz[0][2] == 2 && matriz[1][2] == 2 && matriz[2][2] == 2 ) ||
		    (matriz[0][2] == 2 && matriz[1][1] == 2 && matriz[2][0] == 2 ) ||
		    (matriz[0][1] == 2 && matriz[1][1] == 2 && matriz[2][1] == 2 ) ){
				
			return 2;
		}
		
		
		if( matriz[0][0] != 0 && matriz[0][1] != 0 && matriz[0][2] != 0 && 
			matriz[1][0] != 0 && matriz[1][1] != 0 && matriz[1][2] != 0 && 
			matriz[2][0] != 0 && matriz[2][1] != 0 && matriz[2][2] != 0  ){
					
			return 0;
			
		}
		
		return -1;
	}
	
	public static void zeramatriz() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j]=0;
			}
			
		}
	}

	public static int[][] getMatriz() {
		return matriz;
	}
	
	

}
