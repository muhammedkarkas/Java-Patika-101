import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/odev-ucak-bileti
//Uçak Bileti Fiyatı Hesaplama İF ELSE İF

public class Main {

    public static void main(String[] args) {

        int mesafe, yas;
        double yolculukTipi;
        double mesafeBasiUcret = 0.10;
        double toplamUcusFiyati , yasIndirimi, indirimliTutar, gidisDonusBiletBildirimi, toplamTutarSon;
        double yasIndirimOrani = 0;

        Scanner scan =new Scanner(System.in);

        System.out.print("Lutfen Gideceginiz Mesafeyi Giriniz :");
        mesafe = scan.nextInt();

        System.out.print("Lutfen Yasinizi Giriniz :");
        yas = scan.nextInt();

        System.out.println(" 1.Tek Yon \n 2.Gidis-Donus");
        System.out.print("Lutfen Yolculuk Tipini Giriniz :");
        yolculukTipi = scan.nextDouble();

        if(mesafe < 0)
            System.out.println("Hatali Veri Girdiniz!(Mesafe)");
        if(yas < 0)
            System.out.println("Hatali Veri Girdiniz!(Yas)");
        if(yolculukTipi < 0)
            System.out.println("Hatali Veri Girdiniz!(YolculukTipi)");
        if(yolculukTipi > 2)
            System.out.println("Hatali Veri Girdiniz!(YolculukTipi)");

        toplamUcusFiyati =  mesafe * 0.10;
        yasIndirimi = toplamUcusFiyati * yasIndirimOrani;
        indirimliTutar = toplamUcusFiyati - yasIndirimi;
        gidisDonusBiletBildirimi = indirimliTutar * 0.2;
        toplamTutarSon = (indirimliTutar - gidisDonusBiletBildirimi)*2;

        if(yas < 12){
            if(yolculukTipi == 1){
            yasIndirimOrani = 0.5;
            yasIndirimi = toplamUcusFiyati * yasIndirimOrani;
            System.out.println("Toplam Tutar :"+yasIndirimi );
            } else if (yolculukTipi == 2) {
                yasIndirimOrani = 0.5;
                yasIndirimi = toplamUcusFiyati * yasIndirimOrani;
                indirimliTutar = toplamUcusFiyati - yasIndirimi;
                gidisDonusBiletBildirimi = indirimliTutar * 0.2;
                toplamTutarSon = (indirimliTutar - gidisDonusBiletBildirimi)*2;
                System.out.println("Toplam Tutar :"+toplamTutarSon );
            }

        } else if (yas > 12 && yas < 24) {
            if(yolculukTipi == 1){
                yasIndirimOrani = 0.1;
                yasIndirimi = toplamUcusFiyati * yasIndirimOrani;
                System.out.println("Toplam Tutar :"+yasIndirimi );
            } else if (yolculukTipi == 2) {
                yasIndirimOrani = 0.1;
                yasIndirimi = toplamUcusFiyati * yasIndirimOrani;
                indirimliTutar = toplamUcusFiyati - yasIndirimi;
                gidisDonusBiletBildirimi = indirimliTutar * 0.2;
                toplamTutarSon = (indirimliTutar - gidisDonusBiletBildirimi)*2;
                System.out.println("Toplam Tutar :"+toplamTutarSon );
            }
        } else if (yas >24 && yas <65) {
            if(yolculukTipi == 1){
                toplamUcusFiyati =  mesafe * 0.10;
                System.out.println("Toplam Tutar :"+toplamUcusFiyati );
            } else if (yolculukTipi == 2) {
                toplamUcusFiyati =  mesafe * 0.10;
                gidisDonusBiletBildirimi = toplamUcusFiyati * 0.2;
                toplamTutarSon = (toplamUcusFiyati - gidisDonusBiletBildirimi)*2;
                System.out.println("Toplam Tutar :"+toplamTutarSon );
            }
        } else if (yas > 65) {
            if(yolculukTipi == 1){
                yasIndirimOrani = 0.3;
                yasIndirimi = toplamUcusFiyati * yasIndirimOrani;
                System.out.println("Toplam Tutar :"+yasIndirimi );
            } else if (yolculukTipi == 2) {
                yasIndirimOrani = 0.3;
                yasIndirimi = toplamUcusFiyati * yasIndirimOrani;
                indirimliTutar = toplamUcusFiyati - yasIndirimi;
                gidisDonusBiletBildirimi = indirimliTutar * 0.2;
                toplamTutarSon = (indirimliTutar - gidisDonusBiletBildirimi)*2;
                System.out.println("Toplam Tutar :"+toplamTutarSon );
            }
        }
    }
}