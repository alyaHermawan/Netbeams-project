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
public class point extends user{
    public String id_point;
    public int nominal_point;
    
    public point(){}

    public point(String id_point, int nominal_point) {
        this.id_point = id_point;
        this.nominal_point = nominal_point;
    }

    public void setId_point(String id_point) {
        try {
            if(id_point.equals(null) || id_point.equals("")){
                JOptionPane.showMessageDialog(null, "Id Point wajib diisi");
                this.id_point="-";
            } else {
                this.id_point=id_point;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setNominal_point(int nominal_point) {
        try {
            // area koding benar
            if (nominal_point < 0) {
                JOptionPane.showMessageDialog(null, "Nominal Point tidak Boleh minus");
                this.nominal_point = 0;
            } else {
                this.nominal_point = nominal_point;
            }
        } catch (Exception salah) {
            // area kode jika salah
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getId_point() {
        return id_point;
    }

    public int getNominal_point() {
        return nominal_point;
    }   
        
    public String infoPoint(){   
    String pesan =super.infoUser()+
                "\n ID Point : " + getId_point()+
                "\n Nominal : " + getNominal_point();
    return pesan;
    }
    
    public void infoPointPopup(){
        String pesan = "ID Point : " + getId_point() + "\n"
                    + "Nominal Point : " + getNominal_point();
        JOptionPane.showMessageDialog(null, pesan, "Data Point",JOptionPane.INFORMATION_MESSAGE);
    }
}
