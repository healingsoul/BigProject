package bigproject.Lib;

import java.util.ArrayList;

/**
 *
 * @author Alfaza
 */
public class Loket {
    private int noAntrian;
    private String namaPasien;
    private String TanggalRawat;
    private ArrayList <Dokter> dokter = new ArrayList<>();

    public Loket(int noAntrian, String namaPasien, String TanggalRawat) {
        this.noAntrian = noAntrian;
        this.namaPasien = namaPasien;
        this.TanggalRawat = TanggalRawat;
    }

    public int getNoAntrian() {
        return noAntrian;
    }

    public void setNoAntrian(int noAntrian) {
        this.noAntrian = noAntrian;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getTanggalRawat() {
        return TanggalRawat;
    }

    public void setTanggalRawat(String TanggalRawat) {
        this.TanggalRawat = TanggalRawat;
    }
    
    
    public String Print () {
        String info = "";
        info += "Detail Pemeriksaan \n";
        info += "No Antri\t\t:" + this.noAntrian + "\n";
        info += "Nama Pasien : " +this.getNamaPasien();
        for(Dokter doctor : this.dokter){
            info +="\t" +doctor.getDetailPerlakuan()+" "+ doctor.getBiaya()+":"+"\n";
        }
       // info += "\t"+"Total Biaya:" +this.Total;
        return info;
        
        
        
        
        
    }
}
