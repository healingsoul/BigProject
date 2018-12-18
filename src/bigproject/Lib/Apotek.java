
package bigproject.Lib;

/**
 *
 * @author Rivo
 */
public class Apotek {
    private int kodeObat;
    private String namaObat;
    private int harga;
    private int jumlah;

    public Apotek(int kodeObat, String namaObat, int harga, int jumlah) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public int getTotal(){
        int total = 0;
        total=this.harga * this.jumlah;
        return total;
    }
}
