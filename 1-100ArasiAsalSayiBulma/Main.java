public class Main {
//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/odev-asal-sayi
//Ödev - 1-100 Arasındaki Asal Sayıları Bulan Program

    public static void main(String[] args) {

        int asalSayaci= 0;


        for(int number = 2; number <= 100; number++){ //Döngü en küçük asal sayıdan başlatıldı
            int durum = 0;
            for (int i = 2; i < number; i++){ //Gelen sayının kendinden öncekilere bölünüp bölünmediği kontrol edilir
                if (number % i == 0){
                    durum = 1;
                }
            }
            if(durum == 0){ //Sayı eğer bölünmüyorsa asaldır ekrana yazdırılır
                System.out.println(number + " ");
                asalSayaci++; //bir sonraki sayı için döngü bitene kadar devam eder
            }
        }
    }
}