/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigproject.Lib;

/**
 *
 * @author Rivo
 */
public class TabelModelApotek {
    private String [] column;
    
    public TabelModelApotek(){
        this.column = new String[]{
            "Kode Obat", "Nama Obat", "Jumlah Obat", "Harga Obat", "Sub. Total(Rp.)"
        };
    }
    
    public String[] getColumnName(){
        return this.column;
    }
}
