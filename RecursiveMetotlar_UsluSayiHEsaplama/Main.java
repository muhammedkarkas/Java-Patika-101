import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/odev-recursive-power
//Recursive Metotlar ile Üslü Sayı Hesaplama

public class Main {
    static int usAlma(int base, int exp){
        Scanner scan =new Scanner(System.in);
        int result = 1;

        for(int i = 1; i <= exp; i++){
            result *=base;
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("Taban Degerini Giriniz :");
        int base = scan.nextInt();

        System.out.print("Us Degerini Giriniz :");
        int exp = scan.nextInt();

        usAlma(base,exp);

        System.out.println("Sonuc :" + usAlma(base,exp));
    }
}