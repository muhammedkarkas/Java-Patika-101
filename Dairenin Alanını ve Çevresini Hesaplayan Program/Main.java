import java.util.Scanner;
//Muhammed KARKAŞ -- https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-daire-alan-cevre
//Dairenin Alanını ve Çevresini Hesaplayan Program

public class Main {

    public static void main(String[] args) {

        double yariCap;
        double alan, cevre;
        double pi = 3.14;
        double merkezAcisi;

        Scanner scan =new Scanner(System.in);

        System.out.print("Lutfen YariCap Degeri Giriniz :");
        yariCap = scan.nextDouble();

        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;

        System.out.println(" Alani :"+alan);
        System.out.println(" Cevresi :"+cevre);

        System.out.print("Merkez Acisi Degeri Giriniz :");
        merkezAcisi = scan.nextDouble();

        double daireAlani = (pi*(yariCap*yariCap)*merkezAcisi)/360;

        System.out.println("Daire Alani :"+daireAlani);


    }
}