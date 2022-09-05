import java.util.Scanner;
//Taksimetre Programı
//https://app.patika.dev/muhammedkarkas

public class Main {
    public static void main(String[] args) {

        int km;
        double acilisucreti = 10;
        double kmbasiucret = 2.20;

        Scanner scan =new Scanner(System.in);

        System.out.print("Lutfen gidilen mesafeyi giriniz :");
        km = scan.nextInt();

        double taksimetreTutari = acilisucreti + (km * kmbasiucret);

        boolean taksiucreti = (taksimetreTutari < 20);
        taksimetreTutari = taksiucreti ? 20 : taksimetreTutari;

        System.out.println("Taksi Ucreti :"+taksimetreTutari);

    }
}