import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-atm
//ATM Projesi SWİTCH CASE

public class Main {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        String userName, password;
        int entry = 3; //giris hakkı
        int balance = 1500; //Bakiye


        while (entry > 0){
        System.out.print("Kullanici Adinizi Giriniz :");
        userName = scan.nextLine();
        System.out.print("Sifrenizi Giriniz :");
        password = scan.nextLine();
        if(userName.equals("muhammedkarkas") && password.equals("JavaPatika123")){ //Stringlerde eşit ifadesi equals ile sağlanır
            System.out.println("Bilgiler Dogru Girilmistir...\n  X Bankasina Hosgeldiniz...");
            System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz :");
            System.out.println("1-Para Yatirma\n" +
                    "2-Para Cekme\n" +
                    "3-Bakiye Sorgulama\n" +
                    "4-Cikis Yap");
            int select = scan.nextInt();
            switch (select){
                case 1:
                    System.out.print("Para Miktari :");
                    int price = scan.nextInt();
                    balance += price;
                    break;
                case 2:
                    System.out.print("Para Miktari :");
                    price = scan.nextInt();
                    if (price >balance){
                        System.out.println("Bakiye Yetersiz");
                    }else {
                        balance -= price;
                    }
                    break;
                case 3:
                    System.out.print("Bakiyeniz :"+balance);
                    break;
                case 4:
                    System.out.print("Cikis Yapildi...");
                    break;
            }
        }else{
            entry--;
            System.out.println("Hatali Kullanicia Adi Veya Sifre Girdiniz Tekrar Deneyiniz!!!");
            if(entry == 0){
                System.out.println("Hesabiniz Bloke Olmustur. Lutfen Banka Ile Iletisime Geciniz...");
            }else{
                System.out.println("Kalan Hakkiniz :"+entry); //Kalan hak kullanıcıya gösteriliyor
            }
        }
        }
    }
}