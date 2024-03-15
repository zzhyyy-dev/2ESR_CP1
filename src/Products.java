import java.lang.reflect.Array;
import java.util.Scanner;

public class Products {
    Scanner getInput = new Scanner(System.in);
    double finalValue = 0;
    String prod;
    private double taxes = 0.05;
    public void Handle(String Nprod){
        prod = Nprod;
        switch (Nprod){
            case "banana":
                prod = Nprod;
                HandleAccount(5);
                break;
            case "maça":
                HandleAccount(10);
                break;
            default:
                System.out.println("nao selecionou nenhuma das opções disponíveis");
        }
    }
    public void HandleAccount(int value){
        System.out.print("Qual a quantidade: \n");
        int units = getInput.nextInt();
        int compra = value * units;
        double imposto = compra * taxes;
        double CompraFinal = compra - imposto;
        setValue(CompraFinal);
        System.out.println("\nnome: "+prod);
        System.out.println("valor da compra sem imposto: "+compra);
        System.out.println("unidades: "+units);
        System.out.println("imposto da compra: "+imposto);
        System.out.println("valor da compra com imposto: "+CompraFinal);
    }
    public void setValue(double value){
        double oldValue = finalValue;
        finalValue = oldValue + value;
    }
}
