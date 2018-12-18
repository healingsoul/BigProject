
package bigproject.Lib;

/**
 *
 * @author Rivo
 */
public class TabelModelAdminDokter {
    private String[] coulumn;

    public TabelModelAdminDokter() {
        this.coulumn = new String[]{
            "No ID Dokter", "Nama Dokter", "Spesialis"
        };
    }
    
    public String[] getCoulumnName(){
        return this.coulumn;
    }
    
}
