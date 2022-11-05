package application;

import java.util.Scanner;

import entities.Triangle;
public class Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y, k, l;

        x = new Triangle();
        y = new Triangle();
        k = new Triangle();
        l = new Triangle();

        System.out.println("Lados do triângulo X");
        x.A = sc.nextDouble();
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();
        System.out.println("Lados do triângulo Y");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();
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
        double semiPerimetroK = k.semiPerimetro(k.A, k.B, k.C);
        double areaK = k.area(semiPerimetroK, k.A, k.B, k.C);
        System.out.println("A área do Triângulo K é igual a: " + areaK);

        //Triângulo L
        double semiPerimetroL = l.semiPerimetro(l.A, l.B, l.C);
        double areaL = l.area(semiPerimetroL, l.A, l.B, l.C);
        System.out.println("A área do Triângulo L é igual a: " + areaL);

        //Triângulo X
        double semiPerimetroX = x.semiPerimetro(x.A, x.B, x.C);
        double areaX = x.area(semiPerimetroX, x.A, x.B, x.C);
        System.out.println("A área do Triângulo X é igual a: " + areaX);

        //Triângulo Y
        double semiPerimetroY = y.semiPerimetro(y.A, y.B, y.C);
        double areaY = y.area(semiPerimetroY, y.A, y.B, y.C);
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
}
