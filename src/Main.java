import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//Criar um programa em JAVA que receba o nomes de um produtos, seus valores unitário e informações de quantidade comprada.
//
//Para cada quantidade de produtos  comprados (04), criar uma instancia.
//
//Apresentar os produtos comprados, acrescidos de 5% de imposto
//
//Utilizar:
//Classe(s)
//Encapsulamento
    public static void main(String[] args) {
        System.out.println("Olá seja bem vindo a loja");
//        showprodutos
        HandleBuy dd = new HandleBuy();
        dd.Compra();
    }
}