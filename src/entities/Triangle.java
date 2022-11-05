package entities;

public class Triangle {
    public double A;
    public double B;
    public double C;

    public double area(double p, double a, double b, double c) {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double semiPerimetro(double a, double b, double c) {
        return (a + b + c) / 2;
    }
}
