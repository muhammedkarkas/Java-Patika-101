import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-two-power
//Döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdırma

public class Main {

    public static void main(String[] args) {

        int n;

        Scanner scan =new Scanner(System.in);

        System.out.print("Please enter the number n :");
        n = scan.nextInt();

        System.out.println("Multiples of 4");
        for (int i = 1; i <= n; i*=4){
            System.out.println(i);
        }
        System.out.println("*********************");
        System.out.println("Multiples of 5");
        for (int j =1; j<= n; j*=5){
            System.out.println(j);
        }
    }
}