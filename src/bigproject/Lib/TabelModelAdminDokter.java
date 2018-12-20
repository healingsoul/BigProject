
package bigproject.Lib;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rivo
 */
public class TabelModelAdminDokter extends AbstractTableModel{
    private ArrayList<Admin> data;
    private String[] coulumns;

    public TabelModelAdminDokter(ArrayList<Admin> data) {
        this.coulumns = new String[]{"ID Dokter", "Nama Dokter", "Spesialis"}; 
        this.data = data;
        
    }

    public void setData(ArrayList<Admin> data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return this.data.size();
    }

    @Override
    public int getColumnCount() {
        return this.coulumns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object obj = null;
        switch(columnIndex ){
            case 0 : obj = data.get(rowIndex).getIdDokter(); break;
            case 1 : obj = data.get(rowIndex).getNama(); break;
            case 2 : obj = data.get(rowIndex).getSpesialis(); break;
            

        }
        return obj;
    }

    @Override
    public String getColumnName(int column) {
        return this.coulumns[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 0){
            return Integer.class;
        }else{
        return String.class;
        }
    }
    
    

    
}
