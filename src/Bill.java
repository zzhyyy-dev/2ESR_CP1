public class Bill {
    //ADICIONAR ISSO EM UM ARRAY DE STR, PARA QUANDO FINALIZAR A COMPRA APARECER TODOS OS BILL CRIADOS, OU SEJA, I=0;i < qntComprados;I++;
    Bill(String produto, double valor, int qtd, double imposto, double valorFinal){
        System.out.println("=======================================================\n" +
                "Produto: "+produto+"\n" +
                "Valor sem imposto: "+valor+"\n" +
                "Quantidade do produto: "+ qtd+ "\n" +
                "Valor do imposto: "+imposto+"\n" +
                "Valor final: "+valorFinal+"\n" +
                "=======================================================");
    }
}
