import java.util.Arrays;
import java.util.Scanner;

public class HandleBuy {
    static Products options = new Products();
    Scanner getInput = new Scanner(System.in);
    public String c;
    public void compra(){
        System.out.print("Quer comprar algo? sim ou nao\n");
        c = getInput.nextLine();
        if (!c.equals("nao")){
            Products purchase = new Products();
            while (!c.equals("finalizar")){
                startBuy(purchase);
                System.out.print("\nVocê quer continuar comprando ou finalizar?\n");
                this.c = getInput.nextLine();
            }
            if (Bill.getAllBills().isEmpty()) {
                System.out.println("Nenhum produto foi comprado.");
            } else {
                System.out.println("\nDetalhes da compra:");
                System.out.println(Bill.getAllBills());
                System.out.println("Valor total da compra: R$" + purchase.finalValue);
                System.out.println("Total pago em impostos: R$" + purchase.finalTax);
                System.out.println("Quantidade de compras: " + purchase.qtdPurchased);
            }
        } else {
            System.out.println("abraços");
        }
    }
    public void startBuy(Products finalBuy){
        System.out.print("\nQual produto irá querer?\n");
        System.out.println("Esses são nossos produtos: "+ Arrays.toString(options.prods));
        String prod = getInput.nextLine();
        finalBuy.handleType(prod);
    }
}
