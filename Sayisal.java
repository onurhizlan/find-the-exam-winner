
package GenericMethodOlusturma;


public class Sayisal extends Aday {

    public Sayisal(int turkce, int matematik, int edebiyat, int fizik, String Isim) {
        super(turkce, matematik, edebiyat, fizik, Isim);
    }
    public int puan_hesapla() {
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;
    }

   
}
