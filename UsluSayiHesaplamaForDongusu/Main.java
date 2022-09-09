import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-uslu-sayi
//Üslü Sayi Hesaplama FOR DÖNGÜSÜ

public class Main {

    public static void main(String[] args) {

        int x,y;

        Scanner scan =new Scanner(System.in);

        System.out.print("Number to prime :");
        x = scan.nextInt();

        System.out.print("The number to be the exponent :");
        y = scan.nextInt();

        int total = 1;
        for (int i = 1; i<=y; i++ ){
            total *= x;
        }

        System.out.println("Answer :"+total);

    }
}