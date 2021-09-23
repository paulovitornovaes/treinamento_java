import java.util.Scanner;
import java.math.*;

public class questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        class Ponto{
            int x;
            int y;
            int z;
        }
        Ponto ponto_a = new Ponto();
        Ponto ponto_b = new Ponto();

        System.out.println("Definir valores do ponto A:");
        System.out.println("X:");
        ponto_a.x = teclado.nextInt();
        System.out.println("Y:");
        ponto_a.y = teclado.nextInt();
        System.out.println("Z:");
        ponto_a.z = teclado.nextInt();

        System.out.println("Definir valores do ponto B:");
        System.out.println("X:");
        ponto_b.x = teclado.nextInt();
        System.out.println("Y:");
        ponto_b.y = teclado.nextInt();
        System.out.println("Z:");
        ponto_b.z = teclado.nextInt();

        double distancia = Math.sqrt( Math.pow((ponto_b.x - ponto_a.x), 2) +
                Math.pow((ponto_b.y - ponto_a.y), 2) +
                Math.pow((ponto_b.z - ponto_a.z), 2)
        );

        System.out.println("A distancia entre o ponto A e o ponto B é = " + distancia);
    }
}
