import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/odev-fibo
//Fibonacci Serisi

public class Main {

    public static void main(String[] args) {

        int x;
        int a = 0,b = 1, c;

        Scanner scan =new Scanner(System.in);

        System.out.print("X sayisini gireceksiniz :");
        x = scan.nextInt();

        System.out.print(a+ " " + b); //0 ve 1 i yazdırırız

        for (int i = 2; i <x; i++){ // her zaman 0  ve 1 ile başladığı için döngüyü 2 den başlatıyoruz

            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}