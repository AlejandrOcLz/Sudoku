

import java.util.Random;
import java.util.Stack;

public class MatrizSudoku {
	
	String[][] sudoku = {/*{'5','3','0','0','7','0','0','0','0'},
						   {'6','0','0','1','9','5','0','0','0'},
						   {'0','9','8','0','0','0','0','6','0'},
						   {'8','0','0','0','6','0','0','0','3'},
						   {'4','0','0','8','0','3','0','0','1'},
						   {'7','0','0','0','2','0','0','0','6'},
						   {'0','6','0','0','0','0','2','8','0'},
						   {'0','0','0','4','1','9','0','0','5'},
					       {'0','0','0','0','8','0','0','7','9'}*/};
	
	
	int r=0;

	public MatrizSudoku() {
		// TODO Auto-generated constructor stub
	}
	
	public int randon() {
		Random random = new Random();
		int value = random.nextInt(9 + 1) + 1;
		return value;
	}
	
	public void LlenarMatriz() {
		
	}
	
	public void VerificacionFila(int j) {
		r=randon();
		j=0;
		for(int i=0;i<9;i++) {
			if(sudoku[j][i].equals(Integer.toString(r))) {
				r=randon();
			}
		}
		
	}

}
