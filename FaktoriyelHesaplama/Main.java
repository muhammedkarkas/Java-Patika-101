import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-faktoriyel
//Faktöriyel Hesaplama

public class Main {

    public static void main(String[] args) {

        int n;
        int total = 1;

        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a number :");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            total = total * i;

        }
        System.out.println("Factorial :"+total);


    }
}