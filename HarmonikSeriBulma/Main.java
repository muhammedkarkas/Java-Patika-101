import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-harmonic
//Girilen Sayının Harmonik Serisini Bulma

public class Main {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.print("X sayisini giriniz :");
        int x = scan.nextInt();

        double result = 0;

        for(double i = 1; i <= x; i++){
            result += (1/i); //Bölme işleminde her iki değerden birini double girmeliyiz ki sonuç double çıksın.
        }
        System.out.println("X Sayisinin Harmonik Serisi :"+result);
    }
}