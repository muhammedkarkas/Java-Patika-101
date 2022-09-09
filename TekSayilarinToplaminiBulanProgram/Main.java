import java.util.Scanner;
//https://app.patika.dev/courses/java101/pratik-tek-sayi-toplam
//https://app.patika.dev/muhammedkarkas
//Tek Sayilarin Toplamini Bulan Program

public class Main {

    public static void main(String[] args) {

        int number;
        int total = 0;

        Scanner scan =new Scanner(System.in);

        do {
            System.out.print("Lutfen bir sayi giriniz :");
            number = scan.nextInt();
            if(number % 2 == 1){
                total += number;
            }
        }while ( number > 0);
        System.out.println("Tek Sayilarin Toplami :"+total);


    }
}