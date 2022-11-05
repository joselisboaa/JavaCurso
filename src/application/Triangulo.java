package application;

import java.util.Scanner;

import entities.Triangle;
public class Triangulo {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;

        Triangle k, l;

        System.out.println("Lados do triângulo X");
        x = new Triangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Lados do triângulo Y");
        y = new Triangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        k = new Triangle();
        l = new Triangle();

        System.out.println("Lados do triângulo K");
        k.A = sc.nextDouble();
        k.B = sc.nextDouble();
        k.C = sc.nextDouble();

        System.out.println("Lados do triângulo L");
        l.A = sc.nextDouble();
        l.B = sc.nextDouble();
        l.C = sc.nextDouble();
        sc.close();

        //Triângulo K
        double semiPerimetroK = semiPerimetroTotal(k.A, k.B, k.C);
        double areaK = areaTotal(semiPerimetroK, k.A, k.B, k.C);
        System.out.println("A área do Triângulo K é igual a: " + areaK);

        //Triângulo L
        double semiPerimetroL = semiPerimetroTotal(l.A, l.B, l.C);
        double areaL = areaTotal(semiPerimetroL, l.A, l.B, l.C);
        System.out.println("A área do Triângulo L é igual a: " + areaL);

        //Triângulo X
        double semiPerimetroX = semiPerimetroTotal(x.ladoA, x.ladoB, x.ladoC);
        double areaX = areaTotal(semiPerimetroX, x.ladoA, x.ladoB, x.ladoC);
        System.out.println("A área do Triângulo X é igual a: " + areaX);

        //Triângulo Y
        double semiPerimetroY = semiPerimetroTotal(y.ladoA, y.ladoB, y.ladoC);
        double areaY = areaTotal(semiPerimetroY, y.ladoA, y.ladoB, y.ladoC);
        System.out.println("A área do Triângulo Y é igual a: " + areaY);

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
