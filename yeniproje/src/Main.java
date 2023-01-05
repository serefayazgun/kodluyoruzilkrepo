//Kullanıcıdan veri almak için Scanner kütüphanesi kullanılır.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello \nworld!\tTab");
        System.out.println("Hello \nworld!\tTab \"SEREF\" ");

        int sayi1 = 2, sayi2 = 10 ,toplam = 0;

        toplam = sayi1 + sayi2;
        System.out.println(sayi1 + " ile " + sayi2+" nin Toplamı : " + toplam);

        byte vByte = 127;
        System.out.println(vByte);

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        /*System.out.print("Bir rakam giriniz :");
        int rakam = input.nextInt();
        System.out.println("Girilen rakam : " + rakam);
         */

        /*int matematik,fizik,kimya,turkce,tarih,muzik;

        System.out.println("Matematik notunuzu giriniz:");
        matematik = input.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarih = input.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muzik = input.nextInt();

        double ortalama;
        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Not ortalamanız:" + ortalama);
        */
        /*KDV HESAPLAMA*/
        /*double kdv = 0.18;
        int tutar;
        double kdvliTutar,kdvTutari;
        System.out.println("Tutar giriniz:");
        tutar = input.nextDouble()

        System.out.println("Tutar:" + tutar);
        kdvTutari = tutar * kdv;
        System.out.println("Kdv:" + kdv);
        System.out.println("KDV Tutarı:" + kdvTutari);
        kdvliTutar = tutar +  kdvTutari;
        System.out.println("KDVli tutar:" + kdvliTutar);
        */
        /*TAKSİ METRE HESAPLAMA*/

        /*double taksiMetreAcilis = 10,km,kmTutar = 2.2,taksiMetreTutar,altLimit = 20;
        System.out.print("Gideceğiniz mesafeyi KM cinsinden giriniz :");
        km      = input.nextDouble();
        kmTutar *= km;
        kmTutar += taksiMetreAcilis;
        kmTutar = kmTutar < altLimit ? altLimit : kmTutar;
        System.out.println("Ödeyeceğiniz Tutar :" + kmTutar);

         */
        /*Vücut Kitle İndeksi Hesaplama*/

        double boy,kilo,kitleIndex;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy      = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo      = input.nextDouble();

        kitleIndex = kilo / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz:" + kitleIndex);
    }
}