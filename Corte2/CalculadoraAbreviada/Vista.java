package vista;

import java.util.Scanner;

public class Vista {

    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println(MAGENTA + "\n=== CALCULADORA ===" + RESET);
        System.out.println(VERDE + "1. Resta" + RESET);
        System.out.println(VERDE + "2. Suma" + RESET);
        System.out.println(VERDE + "3. Multiplicacion" + RESET);
        System.out.println(VERDE + "4. Division" + RESET);
        System.out.println(VERDE + "5. Potenciacion" + RESET);
        System.out.println(VERDE + "6. Salir" + RESET);
        System.out.print("Seleccione una opcion: ");
        return sc.nextInt();
    }

    public int leerNumero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public void mostrarResultado(int resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
