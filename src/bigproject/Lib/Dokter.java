package bigproject.Lib;

/**
 *
 * @author Alfaza
 */
public class Dokter {
    private String DiagnosaPenyakit;
    private String DetailPerlakuan;
    private int Biaya;

    public Dokter(String DiagnosaPenyakit, String DetailPerlakuan, int Biaya) {
        this.DiagnosaPenyakit = DiagnosaPenyakit;
        this.DetailPerlakuan = DetailPerlakuan;
        this.Biaya = Biaya;
    }

    public String getDiagnosaPenyakit() {
        return DiagnosaPenyakit;
    }

    public void setDiagnosaPenyakit(String DiagnosaPenyakit) {
        this.DiagnosaPenyakit = DiagnosaPenyakit;
    }

    public String getDetailPerlakuan() {
        return DetailPerlakuan;
    }

    public void setDetailPerlakuan(String DetailPerlakuan) {
        this.DetailPerlakuan = DetailPerlakuan;
    }

    public int getBiaya() {
        return Biaya;
    }

    public void setBiaya(int Biaya) {
        this.Biaya = Biaya;
    }
    
    
}
