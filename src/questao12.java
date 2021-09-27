import java.util.Scanner;

public class questao12 {
    char tabuleiro[][] = new char[3][3];

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int contador = 0; contador < 9; contador++) {
            if (contador == 0) {
                System.out.println("Na primeira jogada para ganhar voce pode\n" +
                        "Jogar na posição [0][0] - [0][2]" +
                        "[2][0] - [2][2]");
            }
            System.out.println("\nJogador 1 escolha onde jogar: ");
            char jogador1 = teclado.next().charAt(0);
        }
    }

    public void imprimir_tabuleiro() {
        for (int i = 0; i < 3; i++) {
            System.out.print("\n");
            for (int j = 0; j < 3; j++) {
                System.out.println(tabuleiro[i][j]);
            }
        }
    }
}
