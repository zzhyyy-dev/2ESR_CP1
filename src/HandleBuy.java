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
                System.out.print("\nVocê quer  continuar comprando ou finalizar?\n");
                this.c = getInput.nextLine();
            }
            if (purchase.finalValue == 0) {
                System.out.println("abraços");
            }else {
                System.out.println("\nO valor final da compra deu R$" + purchase.finalValue + "\n" +
                        "Produtos comprados: " + purchase.products+ "\n" +
                        "Total pago em impostos foi R$" + purchase.finalTax + "\n" +
                        "Quantidade de compras: " + purchase.qtdPurchased);
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
