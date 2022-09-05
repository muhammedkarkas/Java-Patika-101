import java.util.Scanner;
//https://app.patika.dev/courses/java101/pratik-not-ortalamasi
//Muhammed KARKAŞ -- https://app.patika.dev/muhammedkarkas
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        int matematik = scan.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        int fizik = scan.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        int kimya = scan.nextInt();

        System.out.print("Turkce Notunuzu Giriniz : ");
        int turkce = scan.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        int tarih = scan.nextInt();

        System.out.print("Muzik Notunuzu Giriniz : ");
        int muzik = scan.nextInt();

        int ortalama = (matematik+fizik+kimya+turkce+tarih+muzik) / 6;
        System.out.println("Ortalama :"+ortalama);

        System.out.println(ortalama>60 ? "Sinifi Gecti" : "Sinifta Kaldi");
        //ortalama>60 ? "Sınıfı geçti" : "Sınıfta Kaldi"); Koşul ifadesidir.

    }
}