import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-burclar
//Burç Bulma Programı İF ELSE

public class Main {

    public static void main(String[] args) {

        int ay,gun;

        Scanner scan =new Scanner(System.in);

        System.out.print("Dogdugunuz Ayi Giriniz :");
        ay = scan.nextInt();

        System.out.print("Dogdugunuz Gunu Giriniz :");
        gun = scan.nextInt();

        if((ay == 1 && gun <= 21) ||(ay == 12 && gun >= 22)){
            System.out.println("OGLAK BURCU...");
        } else if ((ay == 1 && gun >=22) || (ay == 2 && gun <= 19)) {
            System.out.println("KOVA BURCU...");
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            System.out.println("BALIK BURCU...");
        } else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            System.out.println("KOC BURCU...");
        } else if ((ay == 4 && gun >=21) || (ay == 5 && gun <= 21)) {
            System.out.println("BOGA BURCU...");
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            System.out.println("IKIZLER BURCU...");
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            System.out.println("YENGEC BURCU...");
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            System.out.println("ASLAN BURCU...");
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            System.out.println("BASAK BURCU...");
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            System.out.println("TERAZI BURCU...");
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            System.out.println("AKREP BURCU...");
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            System.out.println("YAY BURCU...");
        }
            
    }

}
