import java.util.*;

public class bingo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char op;

		do {
			int[][] carton = new int[3][9];
			int[] numsCarton = new int[15];
			boolean[] hanSalido = new boolean[99];
			int opcion = -1, numero = -1, numAciertos = 0;

			System.out.println("***EMPIEZA EL BINGO***");
			// colocar primero los espacios
			rellenarEspacios(carton);

			// colocar los números una vez colocados los espacios
			rellenarNumeros(carton, numsCarton);

			do {
				System.out.println("Este es tu carton");

				// Imprimir carton una vez construido
				imprimir(carton);

				// Elegir si seguir jugando o no
				System.out.println("0 para salir, cualquier otro para sacar bola");
				opcion = sc.nextInt();

				if (opcion != 0) {
					// Sacar número que no haya salido antes
					do {
						numero = (int) (Math.random() * 88 + 1);
					} while (hanSalido[numero] == true);

					System.out.println("Ha salido el " + numero);
					hanSalido[numero] = true;

					mostrarHanSalido(hanSalido);

					int estaEnCarton = contiene(numsCarton, numero);

					if (estaEnCarton != -1) {
						int numAMarcar = numsCarton[estaEnCarton];
						marcar(carton, numAMarcar);
						numAciertos++;
					}

					if (numAciertos == 15) {
						opcion = 0;
						System.out.println("***HAS GANADO***");
					}
				}
			} while (opcion != 0);

			System.out.println("Quiere jugar de nuevo? (S para seguir, cualquier otro para salir)");
			op = sc.next().toLowerCase().charAt(0);
		} while (op == 's');

		sc.close();
	}

	/*
	 * Esta función "marca el cartón", colocando un -2 donde se encuentra
	 * el número indicado por num. Ese -2 se sustituirá por una X en el método
	 * imprimir
	 */
	static void marcar(int[][] carton, int num) {
		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[0].length; j++) {
				if (carton[i][j] == num) {
					carton[i][j] = -2;
					return;
				}
			}
		}
	}

	/*
	 * Función que devuelve la posición en el array de un número num.
	 * Si no está, devuelve -1
	 */
	static int contiene(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * Función que rellena el cartón con 4 espacios por fila
	 */
	static void rellenarEspacios(int[][] carton) {
		int[] numRand = new int[4]; // Array para escoger las posiciones aleatorias
		int[] contPos = new int[9]; // Array que cuenta los espacios que hay ya en una columna
		boolean[] usados;

		for (int i = 0; i < carton.length; i++) {
			usados = new boolean[9];
			for (int j = 0; j < numRand.length; j++) {
				do {
					numRand[j] = (int) (Math.random() * 9);
				} while (contPos[numRand[j]] + 1 >= 3 || usados[numRand[j]]);
				contPos[numRand[j]]++; //
				carton[i][numRand[j]] = -1;
				usados[numRand[j]] = true;
			}
		}
	}

	/*
	 * Función que rellena con números el carton. Para ello hay que generar
	 * 9 arrays de 3 enteros distintos ordenados entre un minimo y un máximo.
	 * Esto se implementa en la función rellenaRandomUnicos
	 */
	static void rellenarNumeros(int[][] carton, int[] numsCarton) {
		int[] nums = new int[3];
		int cont = 0;

		for (int i = 0; i < carton[0].length; i++) {
			int min = 10 * i + 1;
			int max = 10 * (i + 1) - 1;
			nums = rellenaRandomUnicos(nums, min, max);
			Arrays.sort(nums);
			for (int j = 0; j < carton.length; j++) {
				if (carton[j][i] != -1) {
					carton[j][i] = nums[j];
					numsCarton[cont] = nums[j];
					cont++;
				}
			}
		}
	}

	/*
	 * Función que devuelve un Array de elementos únicos entre un min y un max
	 * ordenados
	 */
	static int[] rellenaRandomUnicos(int[] arr, int min, int max) {
		Random r = new Random();
		int[] vals = r.ints(min, max).distinct().limit(arr.length).sorted().toArray();
		return vals;
	}

	/*
	 * Función que imprime el cartón usando carácteres unicode
	 * https://www.w3.org/TR/xml-entity-names/025.html
	 */
	static void imprimir(int[][] carton) {
		System.out.print("╭");

		for (int i = 0; i < carton[0].length - 1; i++) {
			System.out.print("───────┬");
		}
		System.out.print("───────╮\n");

		for (int i = 0; i < carton.length; i++) {
			System.out.print("│");
			for (int j = 0; j < carton[i].length; j++) {
				if (carton[i][j] == -1) {
					System.out.print("▓▓▓▓▓▓▓│");
				} else if (carton[i][j] == -2) {
					System.out.print("╳\t│");
				} else {
					System.out.print(carton[i][j] + "\t│");
				}
			}
			System.out.println();
			if (i == carton.length - 1) {
				System.out.print("╰");
				for (int j = 0; j < carton[0].length; j++) {
					if (j == carton[0].length - 1) {
						System.out.print("───────╯");
					} else {
						System.out.print("───────┴");
					}
				}
			} else {
				System.out.print("├");
				for (int j = 0; j < carton[0].length; j++) {
					if (j == carton[0].length - 1) {
						System.out.print("───────┤");
					} else {
						System.out.print("───────┼");
					}
				}
			}
			System.out.println();
		}
	}

	/*
	 * Función que muestra todos los números que han salido ya
	 */
	static void mostrarHanSalido(boolean[] hanSalido) {
		for (int i = 0; i < hanSalido.length; i++) {
			if (hanSalido[i]) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
	}
}