import java.util.Scanner;
//Hesap Makinesi Switch-CASE
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-hesap-mak-1


class Main {
    public static void main(String[] args) {

        int x1, x2, islemTipi;

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz :");
        x1 = scan.nextInt();

        System.out.print("2. Sayiyi Giriniz :");
        x2 = scan.nextInt();

        System.out.println(" 1.Toplama\n 2.Cikarma\n 3.Carpma\n 4.Bolme ");
        System.out.print("Seciminiz :");
        islemTipi = scan.nextInt();

        switch (islemTipi){
            case 1:
                islemTipi = x1 + x2;
                break;
            case 2:
                islemTipi = x1 -x2;
                break;
            case 3:
                islemTipi = x1 * x2;
                break;
            case 4:
                islemTipi = x1 / x2;
                break;
            default:
                System.out.println("Yanlis Secim!!!");
                break;
        }

        System.out.println("Sonuc :"+islemTipi);

    }
}