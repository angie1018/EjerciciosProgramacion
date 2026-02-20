import java.util.Scanner;

public class inversor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("escribe un texto: ");
        String texto = sc.nextLine();

        String invertido = "";
        int i = texto.length() - 1;

        while (i >= 0) {
            invertido = invertido + texto.charAt(i);
            i = i - 1;
        }

        System.out.println("texto invertido: " + invertido);

        sc.close();
    }
}
