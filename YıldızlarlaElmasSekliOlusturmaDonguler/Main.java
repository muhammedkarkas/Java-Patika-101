import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-yildiz-ucgen
//Döngüler ile Yıldızlarla Elmas Şekli Oluşturma

public class Main {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.print("Bir sayi giriniz :");
        int x = scan.nextInt();

        for (int i = 0; i <= x; i++){
            for(int j = 0; j <= (x-i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2* i+1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int a = 0; a < x; a++){
            for (int b = 0; b<= (a+1); b++){
                System.out.print(" ");
            }
            for(int c = 2*x-1; c >= (2*a+1); c--){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}