import java.util.Arrays;
import java.util.Scanner;

public class HandleBuy {
    private Products purchased = new Products();
    Scanner getInput = new Scanner(System.in);
    private String interest;
    public void purchase(){
        System.out.print("Quer comprar algo? sim ou nao\n");
        interest = getInput.nextLine();
        if (!interest.equals("nao")){
            while (!interest.equals("finalizar")){
                startBuy(purchased);
                System.out.print("\nVocê quer continuar comprando ou finalizar?\n");
                this.interest = getInput.nextLine();
            }
            if (Bill.getAllBills().isEmpty()) {
                System.out.println("Nenhum produto foi comprado.");
            } else {
                System.out.println("\nDetalhes da compra:");
                System.out.println(Bill.getAllBills());
                System.out.println("Valor total da compra: R$" + purchased.getFinalValue());
                System.out.println("Total pago em impostos: R$" + purchased.getFinalTax());
                System.out.println("Quantidade de compras: " + purchased.getQtdPurchased());
            }
        } else {
            System.out.println("abraços");
        }
    }
    public void startBuy(Products finalBuy){
        System.out.print("\nQual produto irá querer?\n");
        System.out.println("Esses são nossos produtos: "+ Arrays.toString(purchased.getProducts()));
        String selectedProducts = getInput.nextLine();
        finalBuy.handleType(selectedProducts);
    }
}
