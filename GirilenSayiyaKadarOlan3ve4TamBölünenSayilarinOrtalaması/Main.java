import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-cift-sayi-toplam
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

public class Main {
    public static void main(String[] args) {

        int sayi, katSayi = 0;
        double sayilarinOrtalamasi;
        Scanner scan =new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz :");
        sayi = scan.nextInt();

        int i=0;
        int sayilarToplami = 0;
        while (i <= sayi){
            if(i %3 == 0 && i % 4 == 0){
                sayilarToplami += i;
                katSayi++;
            }
            i++;
        }
        sayilarinOrtalamasi = sayilarToplami/( katSayi-1);
        System.out.println("3 ve 4 Kati olan sayilarin ortalamasi :"+sayilarinOrtalamasi);
    }
}