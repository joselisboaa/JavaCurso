package estoque;

import entities.Product;

import java.util.Scanner;

public class Produto {


 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Product produto = new Product();
    System.out.print("Name: ");
    produto.name = sc.next();
    System.out.print("Price: ");
    produto.price = sc.nextDouble();
    System.out.print("Quantity in stock: ");
    produto.quantity = sc.nextInt();

    System.out.println("Product data: " + produto.name + ", $" + produto.price + ", " + produto.quantity + " units, ");

    System.out.println("Total: $ " + produto.totalValueStock());

    System.out.println("Enter a number of products to be add in stock: ");
    produto.addProducts(sc.nextInt());

    System.out.println("Updated data: " + produto.name + ", $" + produto.price + ", " + produto.quantity + " units, ");

    System.out.println("Total: $ " + produto.totalValueStock());

    System.out.println("Enter the number of products to be removed from stock: ");

    produto.removeProducts(sc.nextInt());
    System.out.println("Updated data: " + produto.name + ", $" + produto.price + ", " + produto.quantity + " units, ");
    sc.close();
 }
}
