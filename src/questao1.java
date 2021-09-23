import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a, b, c;
        System.out.println("Digite o valor de a : ");
        a = teclado.nextFloat();
        System.out.println("Digite o valor de b : ");
        b = teclado.nextFloat();
        System.out.println("Digite o valor de c : ");
        c = teclado.nextFloat();

        double delta = (b * b) - 4 * a * c;
        double raiz_positiva =  ((- b + Math.sqrt(delta)) / (2 * a) );
        double raiz_negativa =  ((- b - Math.sqrt(delta)) / (2 * a) );

        System.out.println("O valor do delta é de " + delta);
        System.out.println("O valor da raiz positiva é de " + raiz_positiva);
        System.out.println("O valor da raiz negativa é de " + raiz_negativa);

    }
}
