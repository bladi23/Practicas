import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        int matriz3x3[][] = new int[3][3];

        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < matriz3x3.length; f++) {
            for (int c = 0; c < matriz3x3.length; f++) {
                System.out.println("Ingrese el numero de la posicion: " + "[" + f + "]" + "[ " + c + "]");
                matriz3x3[f][c] = teclado.nextInt();
            }
        }
        System.out.println("Mostrar Matriz ingresada");
        for (int f = 0; f < matriz3x3.length; f++) {
            for (int c = 0; c < matriz3x3.length; f++) {
                System.out.println(matriz3x3[f][c] + " ");
                matriz3x3[f][c] = teclado.nextInt();
            }
            System.out.println();
        }
    }
}
