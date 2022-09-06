import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/odev-cin-zodyagi
//Çin Zodiyagı Hesaplama

public class Main {

    public static void main(String[] args) {

        int dogumYili;
        int zodiyagHesaplama;
        String zodiyagBurcu;

        Scanner scan =new Scanner(System.in);

        System.out.print("Dogum Yilinizi Giriniz :");
        dogumYili = scan.nextInt();

        zodiyagHesaplama = dogumYili % 12;

        if(zodiyagHesaplama == 0){
            zodiyagBurcu = "Maymun";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 1) {
            zodiyagBurcu = "Horoz";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 2) {
            zodiyagBurcu = "Kopek";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 3) {
            zodiyagBurcu = "Domuz";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 4) {
            zodiyagBurcu = "Fare";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 5) {
            zodiyagBurcu = "Okuz";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 6) {
            zodiyagBurcu = "Kaplan";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 7) {
            zodiyagBurcu = "Tavsan";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 8) {
            zodiyagBurcu = "Ejderha";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 9) {
            zodiyagBurcu = "Yilan";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 10) {
            zodiyagBurcu = "At";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        } else if (zodiyagHesaplama == 11) {
            zodiyagBurcu = "Koyun";
            System.out.println("Cin Zodiyagi Burcunuz :"+zodiyagBurcu);
        }
    }
}