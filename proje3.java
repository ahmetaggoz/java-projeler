package Giris;
import java.util.Scanner;

public class proje3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("A kenarını girin: ");
        a = input.nextDouble();
        System.out.print("B kenarını girin: ");
        b = input.nextDouble();
        a = a * a;
        b = b * b;
        c= Math.sqrt(a + b);
        System.out.print("Hipotenüs: " + c);




    }
}
