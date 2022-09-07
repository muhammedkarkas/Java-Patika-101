import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/odev-artik-yil
//Artik Yil Hesaplama

public class Main {

    public static void main(String[] args) {

        int yil, artikYil;

        Scanner scan =new Scanner(System.in);

        System.out.print("Yil Giriniz :");
        yil = scan.nextInt();

        if(yil % 400 == 0) {
            if (yil % 100 == 0) {
                    artikYil = yil;
                    System.out.println(artikYil + " bir artik yildir!");
            }else {
                System.out.println(yil + " artik yil degildir!");
            }
        } else if (yil % 4 == 0) {
            artikYil = yil;
            System.out.println(artikYil + " Bir artik yildir!");
        }else{
            System.out.println(yil + " artik yil degildir!");
        }
    }
}