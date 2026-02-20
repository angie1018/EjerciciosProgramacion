import java.util.Scanner;

public class vocales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("escribe una palabra en letras minusculas!!! y sin numeros ni caracteres especiales: ");
        String palabra = sc.next();

        int vocales = 0;
        int consonantes = 0;

        int i = 0;
        while (i < palabra.length()) {

            char c = palabra.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales = vocales + 1;
            } else {
                consonantes = consonantes + 1;
            }

            i = i + 1;
        }

        System.out.println("vocales: " + vocales);
        System.out.println("consonantes: " + consonantes);

        sc.close();
    }
}
