package KayitMenuRunner;

public class H02_Kayit1 {

     /*
        1.	Karayollarinda bulunan mobesa kameralarinin mevcut araclarda ki
         plakalari okuyup bize arac hakkinda bilgi vermesini isteyen bir program tasarliyoruz.
        2.	Kameradan okuma kismini kullanicidan plaka alarak simule – test edecegiz.

        3.	Kullanici bir arac plakasi girdigi zaman veritabaninda olan ozellikleri
        bir class ta yaziniz.(Plaka bilgisi, isim-soysisim, arac markasi, adres, arac durumu, vs gibi bilgiler)

        4.	3. Maddede belirtilen ozelliklerde 10 tane nesne uretiniz ve bunlari bir dizi veya listede saklayiniz.

        5.	Kullanicidan alacagimiz plakayi mevcut plakalarla kiyaslayiniz ve supheli-calinti araclari ekranda yazdiriniz.

        Bu odevin hedefleri
        1.	Classlari kullanarak nesne uretmek,

      */

    String plaka="";
    String adSoyad="";
    String aracMarkasi="";
    int yas=0;

    public void Kayit() {
    }

    public void Kayit(String plaka, String adSoyad, String aracMarkasi, int yas) {
        this.plaka = plaka;
        this.adSoyad = adSoyad;
        this.aracMarkasi = aracMarkasi;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "\nplaka :" + plaka +
                        "\nadSoyad :" + adSoyad +
                        "\naracMarkasi :" + aracMarkasi +
                        "\nyas :" + yas ;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAracMarkasi() {
        return aracMarkasi;
    }

    public void setAracMarkasi(String aracMarkasi) {
        this.aracMarkasi = aracMarkasi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}