public class Loja extends Produto {

    float valorAcrescido;
    float acrescimo;

    public void calcularLoja (){
        acrescimo= ((15*valorTotal)/100);
        valorAcrescido = (valorTotal + acrescimo);
        System.out.println(nomeCliente + "você comprou " + quantidade + " " + nomeProduto + " e seu total na LOJA foi de: R$" + valorAcrescido);

    }


}
