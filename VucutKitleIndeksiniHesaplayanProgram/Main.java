import java.util.Scanner;
//Muhammed KARKAŞ -- https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/odev-vucut-kitle-hesaplama
//Ödev - Vücut Kitle İndeksi Hesaplayan Program

public class Main {

    public static void main(String[] args) {

        double boy, kilo;
        double vucutKitleI;

        Scanner scan =new Scanner(System.in);

        System.out.print("Lutfen Boyunuzu (metre cinsinde) Giriniz :");
        boy = scan.nextDouble();

        System.out.print("Lutfen Kilonuzu Giriniz :");
        kilo = scan.nextDouble();

        vucutKitleI = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz :"+vucutKitleI);

    }
}