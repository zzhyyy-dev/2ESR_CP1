import java.lang.reflect.Array;
import java.util.Scanner;

public class Products {
    Scanner getInput = new Scanner(System.in);
    private Array prod;
    private double finalValue = 0;
    private double taxes = 0.05;
    public void Handle(String Nprod){
//        this.prod = Nprod;
        if (Nprod.equals("banana")){
            int valor = 10;
            System.out.print("Qual a quantidade: \n");
            int units = getInput.nextInt();
            if (units >= 4){

            }
            int compra = valor * units;
            double imposto = compra * taxes;
            double CompraFinal = compra - imposto;
            getValue(CompraFinal);
        } else if (Nprod.equals("maça")) {
            int valor = 5;
            System.out.print("Qual a quantidade: \n");
            int units = getInput.nextInt();
            int compra = valor * units;
            double imposto = compra * taxes;
            double CompraFinal = compra - imposto;
            getValue(CompraFinal);
        } else {
            System.out.println("nao selecionou nenhuma das opções disponíveis");
        }
    }
    public void getValue(double value){
        double oldValue = this.finalValue;
        double updateValue = oldValue + value;
        setValue(updateValue);
    }
    public void setValue(double valor){
        this.finalValue = valor;
    }
    public double ShowValue(){
        return this.finalValue;
    }

}
