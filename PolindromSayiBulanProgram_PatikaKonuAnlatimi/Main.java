//https://app.patika.dev/muhammedkarkas
//https://app.patika.dev/courses/java101/pratik-palindrom
//Polindrom sayı bulan program konu anlatımı pratik

public class Main {

    static boolean isPalindrom(int number){  //Return geriye true veya false döndürecek
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            //System.out.println("=================");
            //System.out.println("Number => " + temp); //Aşama Çıktıları

            lastNumber = temp %10;
            //System.out.println("Son Basamak => " + lastNumber); //Aşama Çıktıları

            reverseNumber = (reverseNumber*10)+lastNumber;
            //System.out.println("Yeni Sayi => " + reverseNumber); //Aşama Çıktıları

            temp /= 10;
            //System.out.println("Yeni Temp Degeri => " + temp); //Aşama Çıktıları
        }
        if (number == reverseNumber) //Eğer Polindrom sayı ise true değilse false değeri döndürecek
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(101)); //True döner
        System.out.println(isPalindrom(2476)); //False döner
    }
}
//Amaç numberın basamak sayılarını kullanarak tersini elde etmek
//number ile işlem yapmamamız gerektiği için temp adında geçici bir değişkene atadık
//reverseNumber adında ters sayı için bir değişken oluşturuldu. İlk değeri 0 verildi.
/*
basamakları tek tek 10 a bölerek gezeceğiz ve gezecek basamak kalmadığında çıkacak olan değer 0 olacağı için
döngüden çıkmamız gerekecek bunun için while döngüsü oluşturduk.

lastNumber ile sayımızın 10 a bölümünden kalan bize son sayımızı verecektir. Bu elde ettiğimiz son sayısı
reverseNumberın ilk sayısı yapmamız gerekmektedir. reverseNumber da elimizde olan sayının tersini elde etmemiz gerektiği
için basamaklar yer değiştirecek.Örnek olarak 247 sayısı üzerinden konuşacak olursak ilk lastNumber 7 olacak ve bu sayı
reverseNumber içerisinde en baştaki sayı olacak.İlk reverseNumber değerimiz 0 ve 0*10+7 ile ilk reverseNumber değerimizi
elde ederiz.10 ile çarparak aslında bir basamak eklemiş oluyoruz.Daha sonraki işlemlerde diğer basamaklar ekleneceği için
bu formül ile o basamakları istediğimiz konuma ekleyebileceğiz.

temp /= 10 ile 247 sayısındaki son basamağı silmiş oluyoruz yani 7 değerini atıyoruz.Temp in yeni değeri 24 oluyor ve
işlemlerimize tekrar devam ediyoruz.
 */

    /*int number = 2476;
    int a = number % 10; //Bu form bize number ın son basamağını vermektedir.
        System.out.println(a); //a nın son basamağını ekrana çıktı olarak verdik.

//Basamak silmek için ise 10 a bölümünden yararlanıyoruz.
//Son basamağı bulmak için ise 10 ile mod undan yararlanıyoruz.
//Basamak sayısını arttırmak için 10 ile çarpmamız yeterlidir.

     */