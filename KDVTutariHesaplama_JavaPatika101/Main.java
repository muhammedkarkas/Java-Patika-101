import java.util.Scanner;
//https://app.patika.dev/courses/java101/pratik-kdv-hesaplama
//Muhammed KARKAŞ -- https://app.patika.dev/muhammedkarkas
//KDV tutarını hesaplayan program


public class Main {

    public static void main(String[] args) {

        double ucret;
        double kdvorani = 0.18;

        Scanner scan =new Scanner(System.in);

        System.out.print("Ucreti Giriniz :");
        ucret = scan.nextDouble();

        boolean kdvDegeri = (ucret > 0) && (ucret < 1000);
        kdvorani = kdvDegeri ? 0.18 : 0.08;

        double kdvUcreti = ucret * kdvorani;
        double kdvliUcret = kdvUcreti + ucret;

        System.out.println("KDV'li Ucret :"+kdvliUcret);
        System.out.println("KDV Ucreti :"+kdvUcreti);




    }
}