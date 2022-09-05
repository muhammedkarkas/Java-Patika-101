import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-etkinlik-onerme
//Hava Sıcaklığına Göre Etkinlik Önerme İF ELSE

public class Main {

    public static void main(String[] args) {

        int sicaklik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Sicaklik Giriniz :");
        sicaklik = scan.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak Yapabilirsiniz...");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz...");
        } else if (sicaklik >= 15 && sicaklik <= 25) {
            System.out.println("Piknige Gidebilirsiniz...");
        } else {
            System.out.println("Yuzmeye Gideibilirsiniz...");
        }
    }
}