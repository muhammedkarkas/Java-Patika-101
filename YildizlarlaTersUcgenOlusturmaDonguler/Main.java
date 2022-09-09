import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/odev-ters-ucgen
//Yıldızlarla Ters Üçgen Oluşturma - Döngüler

public class Main {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.print("Basamak Sayisini Giriniz :");
        int n = scan.nextInt();

        for (int a = 0; a < n; a++){
            for(int b = 0; b<= a; b++){
                System.out.print(" ");
            }
            for (int c = 2*n-1; c >= (2*a+1); c--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}