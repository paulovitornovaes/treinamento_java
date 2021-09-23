import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numero;
        System.out.println("Digite um numero = ");
        numero = teclado.nextLine();
        System.out.println("A quantidade de numeros desse valor é de = " + numero.length());
    }
}
