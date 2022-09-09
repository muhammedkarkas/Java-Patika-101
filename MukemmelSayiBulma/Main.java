import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/odev-mukemmel-sayi
//Mükemmel Sayı Bulma Döngüler

public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz :");
        int number = scan.nextInt();
        int bolenlerToplami = 0;

        for (int i = 1; i < number; i++){
            if(number % i == 0){
                bolenlerToplami += i;
            }
        }
        System.out.println("Pozitif Bolenler Toplami :"+bolenlerToplami);

        if (number == bolenlerToplami){
            System.out.println(number + " Mukemmel Bir Sayidir... ");
        }else {
            System.out.println(number + " Mukemmel Bir Sayi Degildir!!!");
        }
    }
}