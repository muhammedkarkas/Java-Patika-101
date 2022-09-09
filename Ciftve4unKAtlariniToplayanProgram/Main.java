import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-tek-sayi-toplam
//Cift ve 4 un katı olan sayiların toplami

public class Main {

    public static void main(String[] args) {

        int number;
        int total = 0;

        Scanner scan =new Scanner(System.in);

        do {
            System.out.print("Lutfen bir sayi giriniz :");
            number = scan.nextInt();
            if(number % 2 == 0 && number % 4 == 0){
                total += number;
            }
        } while (number % 2 == 0);
        System.out.println("Cift Sayilarin Toplami :"+total);
    }
}