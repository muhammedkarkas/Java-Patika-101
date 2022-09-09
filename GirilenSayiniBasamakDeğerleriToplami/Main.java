import java.util.Scanner;
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-armstrong-1
//Girilen Sayinin Basamaklari Toplami

public class Main {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int number = scan.nextInt();
        int tempNumber = number;  //Geçici bir sayi oluşturuldu ve içerisine number atandı
        int basValue =0;  //basamak değerleri
        int basSum =0;  //basamaklar toplamı


        while (tempNumber != 0){
            basValue = tempNumber%10;
            basSum += basValue;
            tempNumber = tempNumber /10;
        }

        System.out.println("Basamaklar Toplami :"+basSum);

    }
}