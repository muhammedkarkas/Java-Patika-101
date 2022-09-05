import java.util.Scanner;
//Muhammed KARKAŞ -- https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-sinif-gecme
//Sınıf Geçme Durumu İF ELSE

public class Main {

    public static void main(String[] args) {

        int matematik,fizik,turkce,kimya,muzik;
        double gecmeNotu;

        Scanner scan =new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        matematik = scan.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = scan.nextInt();

        System.out.print("Turkce Notunuz :");
        turkce = scan.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = scan.nextInt();

        System.out.print("Muzik Notunuz :");
        muzik = scan.nextInt();

        /*Alternatif Olabilir

        if((matematik>0 && matematik<100) && (fizik>0 && fizik<100) && (turkce>0 && turkce<100) && (kimya>0 && kimya<100) && (muzik>0 && muzik<100)){
             gecmeNotu = (matematik + fizik + turkce + kimya + muzik) / 5;
             System.out.println("Gecme Notunuz :"+gecmeNotu);
            if(gecmeNotu >= 55){
                System.out.println("Sinifi Gectiniz...");
            }else{
                System.out.println("Sinifta Kaldiniz...");
            }
        }
        */

        if(matematik < 0 || matematik > 100)
            matematik=0;
        if(fizik < 0 || fizik > 100)
            fizik=0;
        if(turkce < 0 || turkce > 100)
            turkce=0;
        if(kimya < 0 || kimya > 100)
            kimya=0;
        if(muzik < 0 || muzik > 100)
            muzik=0;

        gecmeNotu = (matematik + fizik + turkce + kimya + muzik) / 5;

        if(gecmeNotu >= 55){
            System.out.println("Sinifi Gectiniz...");
        }else{
            System.out.println("Sinifta Kaldiniz...");
        }

        System.out.println("Gecme Notunuz :"+gecmeNotu);


    }
}