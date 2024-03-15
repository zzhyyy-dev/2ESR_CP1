import java.lang.reflect.Array;
import java.util.Scanner;

public class Products {
    Scanner getInput = new Scanner(System.in);
    public double finalValue = 0;

    private double taxes = 0.05;
    public void Handle(String Nprod){
        switch (Nprod){
            case "banana":
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
    }
    public void setValue(double value){
        double oldValue = finalValue;
        finalValue = oldValue + value;
    }
}
