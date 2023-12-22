import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese los elementos de la matriz 3x3:");

        int matriz3x3[][] = new int[3][3];
        for (int f = 0; f < matriz3x3.length; f++) {
            for (int c = 0; c < matriz3x3.length; c++) {
                System.out.print("Ingrese el numero de la posicion " + "[" + f + "]" + "[ " + c + "]: ");
                matriz3x3[f][c] = teclado.nextInt();
            }
        }
        System.out.println("Mostrar Matriz ingresada");
        for (int f = 0; f < matriz3x3.length; f++) {
            for (int c = 0; c < matriz3x3.length; c++) {
                System.out.print(matriz3x3[f][c] + " ");
                
            }
            System.out.println();
        }
    }
}
