import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x;
        int maxNum = 0;
        int minNum = 0;
        int entNumber = 0;

        Scanner scan =new Scanner(System.in);

        System.out.print("Kac tane sayi gireceksiniz :");
        x = scan.nextInt();

        for (int i = 1; i <= x; i++){
            System.out.print(i + ". Sayi :");
            entNumber =scan.nextInt();
            if(i == 1){
                maxNum = entNumber;
                minNum = entNumber;
            }else{
                if (entNumber > maxNum){
                    maxNum = entNumber;
                }else if (entNumber < minNum){
                    minNum = entNumber;
                }
            }
        }
        System.out.println("En Buyuk Sayi :"+maxNum);
        System.out.println("En Kucuk Sayi :"+minNum);

    }
}