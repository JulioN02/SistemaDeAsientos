package sistema.de.asientos;

import java.util.Scanner;

public class SistemaDeAsientos {

    public static void main(String[] args) {

        int fila = 0, asiento = 0;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        String respuesta1, respuesta2;
        boolean Controlador = false;

        char Asientos[][] = new char[10][10];
        for (int f = 0; f <= 9; f++) {
            for (int c = 0; c <= 9; c++) {
                Asientos[f][c] = 'L';
            }
        }

        while (Controlador != true) {
            System.out.println("----------Reserva tu asiento----------");
            System.out.println("¿Desea visualizar los asientos disponibles? Ingrese Si para mostrar o Cualquier letra para continuar");
            respuesta1 = sc3.next();
            if (respuesta1.equalsIgnoreCase("si")) {
                dibujarMapa(Asientos);
            }

            boolean Ok = false;
            while (Ok != true) {
                System.out.println("\n Elige la fila y asiento:");
                System.out.println("Ingresa la fila entre el 0 y 9");
                fila = sc.nextInt();
                System.out.println("Ingresa el asiento entre el 0 y 9");
                asiento = sc2.nextInt();
                if (fila <= 9 && fila >= 0) {
                    if (asiento <= 9 && asiento >= 0) {
                        Ok = true;
                    }
                    System.out.println("El numero de asiento no es valido");
                } else {
                    System.out.println("El numero de fila no es valido");
                }
            }

            if (Asientos[fila][asiento] == 'L') {
                Asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente");
            } else {
                System.out.println("El asiento esta ocupado. Por favor elija otro asiento");
            }
            System.out.println("¿Desea finalizar la reserva? S: si. Cualquier otra letra: No");
            respuesta2 = sc3.next();
            if (respuesta2.equalsIgnoreCase("S")) {
                Controlador = true;
            }
        }
    }

    static void dibujarMapa(char Asientos[][]) {
        for (int f = 0; f <= 9; f++) {
            System.out.print(f + " ");
            for (int c = 0; c <= 9; c++) {
                System.out.print("[" + Asientos[f][c] + "]");
            }
            System.out.println("");
        }
    }
}
