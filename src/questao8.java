import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int f0 = 0;
        int f1 = 1;
        int aux, input;
        System.out.println("Digite um número = ");
        input = teclado.nextInt();

        System.out.print(f0 + " " + f1 + " ");
        for (int i = 0; i < input; i++) {
            aux = f0 + f1;
            f1 = f0;
            f0 = aux;
            System.out.print(aux + " ");
        }

    }
}
