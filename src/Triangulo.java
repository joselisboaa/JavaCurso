import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lados do triângulo X");

        double ladoA = sc.nextDouble();
        double ladoB = sc.nextDouble();
        double ladoC = sc.nextDouble();

        double perimetro = semiPerimetroTotal(ladoA, ladoB, ladoC);
    }

    private static double semiPerimetroTotal(double a, double b, double c ) {
        return (a + b + c)/2;
    }
}
