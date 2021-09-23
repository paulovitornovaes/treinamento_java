import java.util.Scanner;
import java.math.*;

public class questao10 {
    public static void main(String[] args) {
        char resposta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor investido por mes : ");
        float capital = teclado.nextFloat();
        System.out.println("Digite a taxa de juros : ");
        float juros = (teclado.nextFloat() / 100);
        float montante = capital + (capital * juros);

        do {
            for (int i = 1; i < 12; i++) {
                montante = montante + (montante * juros) + capital;
                System.out.println(montante);
            }
            System.out.println("Deseja processar mais um ano? (S/N) ");
            resposta = teclado.next().charAt(0);

        }while (resposta != 'n');

        System.out.println("Montante final = " + montante);
    }

}
