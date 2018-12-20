package bigproject.Lib;

import java.util.ArrayList;

/**
 *
 * @author Alfaza
 */
public class Admin {
    private int idDokter;
    private String nama;
    private String Spesialis;

    public Admin(String nama, String spesialis) {
        this.nama = nama;
        this.Spesialis = spesialis;
    }

    
    public Admin(int idDokter, String nama, String Spesialis) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.Spesialis = Spesialis;
    }

    public int getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(int idDokter) {
        this.idDokter = idDokter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialis() {
        return Spesialis;
    }

    public void setSpesialis(String Spesialis) {
        this.Spesialis = Spesialis;
    }
}
