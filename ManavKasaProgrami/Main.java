import java.util.Scanner;
//https://app.patika.dev/courses/java101/odev-manav-kasa
//https://app.patika.dev/muhammedkarkas
//Manav Kasa Programı - ÖDEV
public class Main {

    public static void main(String[] args) {

        double armutprice = 2.14;
        double elmaprice = 3.67;
        double domatesprice = 1.11;
        double muzprice = 0.95;
        double patlicanprice = 5.0;

        double fiyat;
        double armutkilo,elmakilo,domateskilo,muzkilo,patlicankilo;

        Scanner scan =new Scanner(System.in);

        System.out.print("Armut Kac Kilo :");
        armutkilo = scan.nextDouble();

        System.out.print("Elma Kac Kilo :");
        elmakilo = scan.nextDouble();

        System.out.print("Domates Kac Kilo :");
        domateskilo = scan.nextDouble();

        System.out.print("Muz Kac Kilo :");
        muzkilo = scan.nextDouble();

        System.out.print("Patlican Kac Kilo :");
        patlicankilo = scan.nextDouble();

        fiyat = (armutprice*armutkilo)+(elmaprice*elmakilo)+(domatesprice*domateskilo)+(muzprice*muzkilo)+(patlicanprice*patlicankilo);

        System.out.println("Toplam Fiyat : "+fiyat);






    }
}