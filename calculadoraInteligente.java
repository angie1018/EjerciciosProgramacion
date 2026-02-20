import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println("=== Calculadora inteligente ===");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicación");
            System.out.println("4) División");
            System.out.println("0) Salir");
            System.out.print("Elige: ");

            int opcion = sc.hasNextInt() ? sc.nextInt() : -1;
            sc.nextLine(); // limpia el salto de línea si ingresan números

            switch (opcion) {
                case 0:
                    seguir = false;
                    break;

                case 1: {
                    double a = leerNumero(sc, "Número 1: ");
                    double b = leerNumero(sc, "Número 2: ");
                    System.out.println("Resultado: " + (a + b));
                    break;
                }

                case 2: {
                    double a = leerNumero(sc, "Número 1: ");
                    double b = leerNumero(sc, "Número 2: ");
                    System.out.println("Resultado: " + (a - b));
                    break;
                }

                case 3: {
                    double a = leerNumero(sc, "Número 1: ");
                    double b = leerNumero(sc, "Número 2: ");
                    System.out.println("Resultado: " + (a * b));
                    break;
                }

                case 4: {
                    double a = leerNumero(sc, "Número 1: ");
                    double b = leerNumero(sc, "Número 2: ");
                    if (b == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado: " + (a / b));
                    }
                    break;
                }

                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println();
        }

        sc.close();
    }

    private static double leerNumero(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada inválida. Intenta de nuevo: ");
            sc.next(); // descarta la entrada inválida
        }
        return sc.nextDouble();
    }
}
