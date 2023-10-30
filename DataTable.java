/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_7;

import java.util.ArrayList;

/**
 *
 * @author DERRAL
 */
public class DataTable {
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    public void setData(ArrayList<String> data) {
        this.data.add(data);
    }

    public void remove(int row) {
        this.data.remove(row);
    }

    public String getData(int row, int col) {
        return data.get(row).get(col);
    }

    public ArrayList<String> getDataRow(int row) {
        return data.get(row);
    }

    public void setDataRow(int row, int col, String value) {
        data.get(row).set(col, value);
    }

    public int getSize(int row) {
        return data.get(row).size();
    }

    public int getSizeAll() {
        return data.size();
    }
}