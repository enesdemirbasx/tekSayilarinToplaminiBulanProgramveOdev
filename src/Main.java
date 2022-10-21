import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        //girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
      /*Scanner inp=new Scanner(System.in);
        int sayi,toplam=0;
        System.out.println("BU PROGRAM NEGATİF SAYI GİRENE KADAR GİRDİĞİNİZ TEK SAYILARI TOPLAYACAKTIR!");
        do {
            System.out.print("Sayı giriniz: ");
            sayi= inp.nextInt();
            if (sayi%2==1){
                toplam+=sayi;
            }
        }while(sayi>0);
        System.out.println("Girilen Tek Sayıların Toplamı: "+toplam);
        */
        Scanner inp=new Scanner(System.in);
        int sayi,toplam=0;
        System.out.println("BU PROGRAM TEK SAYI GİRENE KADAR GİRDİĞİNİZ ÇİFT VE 4'ÜN KATI OLAN SAYILARI TOPLAYACAKTIR!");
        do {
            System.out.print("Sayı giriniz: ");
            sayi= inp.nextInt();
            if (sayi%2==0 && sayi%4==0){
                toplam+=sayi;
            }
        }while(sayi%2==0);
        System.out.println("Girilen Çift ve 4'ün Katı Olan Sayıların Toplamı: "+toplam);
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
        // değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

    }
}