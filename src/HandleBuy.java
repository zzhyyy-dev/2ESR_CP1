import java.util.Scanner;

public class HandleBuy {
    public String c;
    public void Compra(){
        Scanner getInput = new Scanner(System.in);
        System.out.print("Você quer comprar? sim ou nao\n");
        c = getInput.nextLine();
        if (!c.equals("nao")){
            Products purchase = new Products();
            while (!c.equals("finalizar")){
                StartBuy(purchase);
                System.out.print("\nVocê quer  continuar comprando ou finalizar?\n");
                this.c = getInput.nextLine();
            }
            if (purchase.finalValue == 0) {
                System.out.println("abraços");
            }else {
                System.out.println("o valor final da compra deu " + purchase.finalValue);
            }
        } else {
            System.out.println("abraços");
        }
    }
    public void StartBuy(Products finalBuy){
        Scanner getInput = new Scanner(System.in);
        System.out.print("Qual produto irá querer?\n");
        String prod = getInput.nextLine();
        finalBuy.HandleType(prod);
    }
}
