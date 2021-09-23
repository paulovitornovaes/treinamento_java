import java.util.Scanner;

public class questao11 {
    static double raiz(int x, int lim) {
        double resultado = 0;
        for (double i = 0; i < (lim + x); i++) {
            if (i * i == x) {
                return i;
            }else
                if (i * i == x + i){
                    return i;
                }

        }
        System.out.println("Nao foi achado...");
        return 0;
    }

    public static void main(String[] args) {
        int numero;
        int limite;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero = ");
        numero = teclado.nextInt();
        System.out.println("Digite o limite = ");
        limite = teclado.nextInt();

        double numero_raiz = raiz(numero, limite);
        System.out.println("A raiz quadrada desse número é = " + numero_raiz);

    }
}
