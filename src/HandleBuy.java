import java.util.Scanner;

public class HandleBuy {
    public String c;
    public void Compra(){
        Scanner getInput = new Scanner(System.in);
        System.out.print("Você quer comprar? sim ou nao\n");
        String vontade = getInput.nextLine();
        c = vontade;
        if (c.equals("sim")){
            Products end = new Products();
            while (!c.equals("finalizar")){
                newHandle(end);
                System.out.print("Você quer  continuar comprando ou finalizar?\n");
                String vontde = getInput.nextLine();
                this.c = vontde;
            }
            if (end.finalValue == 0) {
                System.out.println("abraco");
            }else {
                System.out.println("o valor final da compra deu " + end.finalValue);
            }
        } else {
            System.out.println("abraco");
        }
    }

    public void newHandle(Products finalBuy){
        Scanner getInput = new Scanner(System.in);
        System.out.print("Qual produto irá querer?\n");
        String buy = getInput.nextLine();
        finalBuy.Handle(buy);
    }
}
