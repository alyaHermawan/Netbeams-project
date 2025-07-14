/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class transaksiDetail extends transaksi {
    public String id_detail;
    public int quantity;
    
    public transaksiDetail(){}

    public transaksiDetail(String id_detail, int quantity) {
        this.id_detail = id_detail;
        this.quantity = quantity;
    }

    public void setId_detail(String id_detail) {
        try {
            if(id_detail.equals(null) || id_detail.equals("")){
                JOptionPane.showMessageDialog(null, "Id Detail wajib diisi");
                this.id_detail="-";
            } else {
                this.id_detail=id_detail;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setQuantity(int quantity) {
        try {
            // area koding benar
            if (quantity < 0) {
                JOptionPane.showMessageDialog(null, "Quantity tidak Boleh minus");
                this.quantity = 0;
            } else {
                this.quantity = quantity;
            }
        } catch (Exception salah) {
            // area kode jika salah
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getId_detail() {
        return id_detail;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public String infoDetail(){   
    String pesan =super.infoTransaksi()+
                "\n ID Detail : " + getId_detail()+
                "\n Quantity : " + getQuantity();
    return pesan;
    }
    
    public void infoDetailPopup(){
        String pesan = "ID Detail : " + getId_detail() + "\n"
                    + "Quantity : " + getQuantity();
        JOptionPane.showMessageDialog(null, pesan, "Data Transaksi Detail",JOptionPane.INFORMATION_MESSAGE);
    } 
}
