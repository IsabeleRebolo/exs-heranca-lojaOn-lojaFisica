import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Loja loja = new Loja ();
        Site site = new Site ();


        Scanner ler = new Scanner (System.in);

        System.out.println("Você deseja realizar compras pela LOJA ou SITE?");

        if (ler.next().equals("LOJA")) {

            // Produtos da LOJA

            System.out.println("Digite o seu nome:");
            loja.setNomeCliente(ler.next());

            System.out.println("Digite o nome do produto:");
            loja.setNomeProduto(ler.next());

            System.out.println("Digite a quantidade do produto desejado:");
            loja.setQuantidade(ler.nextInt());

            System.out.println("Digite o valor do produto:");
            loja.setValor(ler.nextInt());

            loja.valorTotal();
            loja.calcularLoja();


        }else {



            // Produtos do Site

            System.out.println("Digite o seu nome:");
            site.setNomeCliente(ler.next());

            System.out.println("Digite o nome do produto:");
            site.setNomeProduto(ler.next());

            System.out.println("Digite a quantidade do produto desejado:");
            site.setQuantidade(ler.nextInt());

            System.out.println("Digite o valor do produto:");
            site.setValor(ler.nextInt());

            site.espacar();
            site.publicarFoto();
            site.espacar2();

            site.valorTotal();

            site.calcularTotal();



        }

    }
}
