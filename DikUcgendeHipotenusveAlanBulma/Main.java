import java.util.Scanner;
//https://app.patika.dev/courses/java101/pratik-hipotenus-bulma
//Muhammed KARKAŞ -- https://app.patika.dev/muhammedkarkas
//Dik Üçgende Hipotenüs ve ALan Bulan Program

public class Main {
    public static void main(String[] args) {

        double a,b,c;
        double ucgenAlani;

        Scanner scan =new Scanner(System.in);

        System.out.print("Lutfen 1. Kenar(a) uzunlugunu giriniz :");
        a = scan.nextDouble();

        System.out.print("Lutfen 2. Kenar(b) uzunlugunu  giriniz :");
        b = scan.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Ucgenin hipotenusu :"+c);

        ucgenAlani = (a*b)/2;

        System.out.println("Ucgenin Alani :"+ucgenAlani);




    }
}