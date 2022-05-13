

import java.util.Random;
import java.util.Stack;

public class MatrizSudoku {
	
	/* N�meros de almacenamiento de matriz */
	private static int[][] n = new int[9][9];
	String[][] sudoku = new String[9][9];
	/* Generar una matriz fuente de n�meros aleatorios a partir de los cuales se generan n�meros aleatorios */
	private static int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	
	public MatrizSudoku(){
		int[][] shuDu=generateShuDu();
		acomodar();
		
		// resultado de salida
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void acomodar() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				
				Random ran = new Random();
				
				int si = ran.nextInt(80+1);
				sudoku[i][j] = "-";
				if(si%2==0) {
					sudoku[i][j] = Integer.toString(n[i][j]);
					System.out.println(si);
				}
				
			}
			
		}
	}

	public static int[][] generateShuDu(){
		// generar n�meros
		for (int i = 0; i < 9; i++) {
			// n�mero de intentos de llenar
			int time = 0;
			// completa los n�meros
			for (int j = 0; j < 9; j++) {
				// generar n�meros
				n[i][j] = generateNum(time);
				// Si el valor de retorno es 0, significa que est� atascado y devuelto para su procesamiento
				// El principio del procesamiento de devoluci�n es: si no es la primera columna, volver� primero a la columna anterior; de lo contrario, volver� a la �ltima columna de la l�nea anterior.
				if (n[i][j] == 0) {
					// no la primera columna, retrocede una columna
					if (j > 0) {
						j -= 2;
						continue;
					} else {// es la primera columna, luego retrocede a la �ltima columna de la l�nea anterior
						i--;
						j = 8;
						continue;
					}
				}
				// Llenado exitosamente
				if (isCorret(i, j)) {
					// Inicializa el tiempo para prepararte para el pr�ximo llenado
					time = 0;
				} else {// continuar llenando
					// Incrementa el n�mero en 1
					time++;
					// contin�a llenando la celda actual
					j--;
				}
			}
		}
		return n;
	}

	/**
	 * Si se cumplen los requisitos de filas, columnas y �reas 3X3 no repetitivas
	 * 
	 * @param row
	 * N�mero de l�nea
	 * @param col
	 * N�mero de columna
	 * @return true indica cumplimiento
	 */
	private static boolean isCorret(int row, int col) {
		return (checkRow(row) & checkLine(col) & checkNine(row, col));
	}

	/**
	 * Compruebe si la l�nea cumple con los requisitos
	 * 
	 * @param row
	 * Verifique el n�mero de l�nea
	 * @return true indica cumplimiento
	 */
	private static boolean checkRow(int row) {
		for (int j = 0; j < 8; j++) {
			if (n[row][j] == 0) {
				continue;
			}
			for (int k = j + 1; k < 9; k++) {
				if (n[row][j] == n[row][k]) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Compruebe si las columnas cumplen los requisitos
	 * 
	 * @param col
	 * N�mero de columna marcada
	 * @return true indica cumplimiento
	 */
	private static boolean checkLine(int col) {
		for (int j = 0; j < 8; j++) {
			if (n[j][col] == 0) {
				continue;
			}
			for (int k = j + 1; k < 9; k++) {
				if (n[j][col] == n[k][col]) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Compruebe si el �rea 3X3 cumple con los requisitos
	 * 
	 * @param row
	 * Verifique el n�mero de l�nea
	 * @param col
	 * N�mero de columna marcada
	 * @return true indica cumplimiento
	 */
	private static boolean checkNine(int row, int col) {
		// obtener las coordenadas de la esquina superior izquierda
		int j = row / 3 * 3;
		int k = col / 3 * 3;
		// comparaci�n de bucles
		for (int i = 0; i < 8; i++) {
			if (n[j + i / 3][k + i % 3] == 0) {
				continue;
			}
			for (int m = i + 1; m < 9; m++) {
				if (n[j + i / 3][k + i % 3] == n[j + m / 3][k + m % 3]) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Generar n�meros aleatorios entre 1-9 Regla: los n�meros aleatorios generados se colocan en la posici�n de �ndice de 8 veces de la matriz. A medida que aumenta el tiempo, los n�meros que se han intentado no se recuperar�n.
	 * Nota: es decir, la primera vez es aleatoria de todos los n�meros, la segunda vez es aleatoria de los primeros ocho n�meros, y as� sucesivamente, para garantizar la aleatoriedad y no tomar repetidamente n�meros que no cumplan con los requisitos, mejorando el Eficiencia
	 * Esta regla es el n�cleo de este algoritmo.
	 * 
	 * @param time
	 * N�mero de veces para llenar, 0 significa primer llenado
	 * @return
	 */
	private static Random r=new Random();
	private static int generateNum(int time) {
		// En el primer intento, inicialice la matriz fuente de n�meros aleatorios
		if (time == 0) {
			for (int i = 0; i < 9; i++) {
				num[i] = i + 1;
			}
		}
		// El d�cimo relleno, que indica que la posici�n est� atascada, el programa principal devuelve 0 y el programa principal lo devuelve
		if (time == 9) {
			return 0;
		}
		// no es el primer relleno
		// Genera un n�mero aleatorio, el n�mero es el �ndice de la matriz, toma el n�mero correspondiente al �ndice en la matriz num como un n�mero aleatorio
//		int ranNum = (int) (Math.random() * (9 - time));//j2se
		int ranNum=r.nextInt(9 - time);//j2me
		// coloca el n�mero en la pen�ltima posici�n de tiempo de la matriz,
		int temp = num[8 - time];
		num[8 - time] = num[ranNum];
		num[ranNum] = temp;
		// n�mero de retorno
		return num[8 - time];
	}
	

}
