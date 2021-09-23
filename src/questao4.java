import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        class Produto{
            String nome;
            float valor;
            int quantidade;
        }
        Produto produto1 = new Produto();
        System.out.println("Digite o nome do produto: ");
        produto1.nome = teclado.nextLine();
        System.out.println("Digite o valor do produto: ");
        produto1.valor = teclado.nextFloat();
        System.out.println("Digite a quantidade do produto: ");
        produto1.quantidade = teclado.nextInt();

        if (produto1.quantidade <= 10){
            System.out.println("Voce deve pagar = " +
                            (produto1.quantidade * produto1.valor) +
                            " Não houve desconto..."
                    );
        }
        if (produto1.quantidade > 10 && produto1.quantidade <= 20) {
            System.out.println("Voce deve pagar = " +
                    ((produto1.quantidade * produto1.valor) * 0.9) +
                    " Desconto de 10%"
            );
        }
        if (produto1.quantidade > 20 && produto1.quantidade <= 50) {
            System.out.println("Voce deve pagar = " +
                    ((produto1.quantidade * produto1.valor) * 0.8) +
                    " Desconto de 20%"
            );
        }
        if (produto1.quantidade > 50) {
            System.out.println("Voce deve pagar = " +
                    ((produto1.quantidade * produto1.valor) * 0.75) +
                    " Desconto de 25%"
            );
        }

    }
}
