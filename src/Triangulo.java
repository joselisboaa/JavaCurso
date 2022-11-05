import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lados do triângulo X");

        double ladoA = sc.nextDouble();
        double ladoB = sc.nextDouble();
        double ladoC = sc.nextDouble();

        System.out.println("Lados do triângulo Y");

        double ladoX = sc.nextDouble();
        double ladoY = sc.nextDouble();
        double ladoZ = sc.nextDouble();

        sc.close();
        //Triângulo X
        double semiPerimetroX = semiPerimetroTotal(ladoA, ladoB, ladoC);
        double areaX = areaTotal(semiPerimetroX, ladoA, ladoB, ladoC);
        System.out.println("A área do Triângulo X é igual a:" + areaX);
        //Triângulo Y
        double semiPerimetroY = semiPerimetroTotal(ladoX, ladoY, ladoZ);
        double areaY = areaTotal(semiPerimetroY, ladoX, ladoY, ladoZ);
        System.out.println("A área do Triângulo Y é igual a:" + areaY);

        System.out.println("A maior área é do triângulo: " + comparadorAreas(areaX, areaY));
    }

    private static String comparadorAreas (double areaX, double areaY) {
        if(areaX > areaY) {
            return "TrianguloX";
        } else {
            return "TrianguloY";
        }
    }

    private static double areaTotal(double p, double a, double b, double c) {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double semiPerimetroTotal(double a, double b, double c ) {
        return (a + b + c) / 2;
    }
}
