import java.util.Scanner;
//Hesap Makinesi İF_ELSE
//https://app.patika.dev/muhammedkarkas


 class Main {
    public static void main(String[] args) {

        int x1,x2,islemTipi;

        Scanner scan =new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz :");
        x1 = scan.nextInt();

        System.out.print("2. Sayiyi Giriniz :");
        x2 = scan.nextInt();

        System.out.println(" 1.Toplama\n 2.Cikarma\n 3.Carpma\n 4.Bolme ");
        System.out.print("Seciminiz :");
        islemTipi = scan.nextInt();

        if(islemTipi == 1){
            System.out.println("Toplam :"+ (x1+x2));
        } else if (islemTipi == 2) {
            System.out.println("Cikarma :"+ (x1 -x2));
        } else if (islemTipi == 3) {
            System.out.println("Carpma :"+ (x1*x2));
        } else if (islemTipi == 4) {
            System.out.println("Bolme :"+ (x1/x2));
        }else{
            System.out.println("Yanlis Secim!!!");
        }

    }
}