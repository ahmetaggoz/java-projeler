package Giris;
import java.util.Scanner;
public class proje4 {
    public static void main(String[] args) {
        int a,b,c,u;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.print("A kenarını girin: ");
        a = input.nextInt();
        System.out.print("B kenarını girin: ");
        b = input.nextInt();
        System.out.print("C kenarını girin: ");
        c = input.nextInt();

        u = (a + b + c) / 2 ;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Üçgenin alanı : " + alan);

    }
}
