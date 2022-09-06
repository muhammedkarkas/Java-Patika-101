import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-sayi-siralama
//Sayiları Kucukten Buyuge Siralama

public class Main {

    public static void main(String[] args) {

        int number1, number2, number3;

        Scanner scan =new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz :");
        number1 = scan.nextInt();

        System.out.print("2. Sayiyi Giriniz :");
        number2 = scan.nextInt();

        System.out.print("3. Sayiyi Giriniz :");
        number3 = scan.nextInt();

        if(number1<number2 && number1<number3){
            if(number2<number3){
                System.out.println("a<b<c");
            }else{
                System.out.println("a<c<b");
            }
        } else if (number2<number1 && number2<number3) {
            if(number1<number3){
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<a");
            }
        } else if (number3<number1 && number3<number2) {
            if(number1<number2){
                System.out.println("c<a<b");
            }else{
                System.out.println("c<b<a");
            }
        }
    }
}