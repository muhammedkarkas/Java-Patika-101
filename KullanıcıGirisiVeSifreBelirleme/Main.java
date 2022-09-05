import java.util.Scanner;
//Kullanici Girisi Ve Sifre İsteme - İF ELSE
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-login-1

public class Main {

    public static void main(String[] args) {

        String kullaniciAdi, sifre, yeniSifre, cevap;

        Scanner scan =new Scanner(System.in);

        System.out.print("Kullanici Adinizi Giriniz :");
        kullaniciAdi = scan.nextLine();

        System.out.print("Sifrenizi Giriniz :");
        sifre = scan.nextLine();

        if(kullaniciAdi.equals("java") && (sifre.equals("patikaDEV"))){
            System.out.println(" Basarili Giris ");
        } else if (!kullaniciAdi.equals("java")|| (sifre.equals("patikaDEV"))) {
            System.out.println("Kullanici Adi Hatali Lutfen Tekrar Deneyiniz!!!");
        } else if (kullaniciAdi.equals("java")||(!sifre.equals("patikaDEV"))) {
            System.out.println("Sifre Hatali!!!");
            System.out.println("Yeni bir sifre olusturmak ister misiniz?");
            cevap = scan.nextLine();
            if(cevap.equals("n")||cevap.equals("N")){
                System.out.println("Sisteme Girişiniz Engellendi");
            } else if (cevap.equals("y")||cevap.equals("Y")) {
                System.out.print("Yeni Sifrenizi Giriniz :");
                yeniSifre = scan.nextLine();
                if (yeniSifre.equals("patikaDEV")){
                    System.out.println("Yeni Sifreniz Bir Onceki Sifre Ile Ayni Olamaz !!! ");
                }else{
                    sifre = yeniSifre;
                    System.out.println("Sifre Basarili Bir Sekilde Degistirildi");
                }
            }
        }

    }
}