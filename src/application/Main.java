package application;

public class Main {

    static String original = "testando letras aleatorias";

    static String[] teste = original.split(" ");

    static String firstIndex = teste[0];
    static String secondIndex = teste[1];
    static String thirdIndex = teste[2];
    public static void teste (String x) {
        System.out.println(x);
    }

    public static void and (byte x, byte y) {
        System.out.println(x & y);
    }

    public static void main(String[] args) {
        System.out.println(teste);
        teste("Olá mundo!");
        and((byte) 11, (byte) 23);
        System.out.println(firstIndex + secondIndex + thirdIndex);
    }
}