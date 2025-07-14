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
public class user {
    public String id_user;
    public int total_point;
    
    public user(){}

    public user(String id_user, int total_point) {
        this.id_user = id_user;
        this.total_point = total_point;
    }

    public void setId_user(String id_user) {
        try {
            if(id_user.equals(null) || id_user.equals("")){
                JOptionPane.showMessageDialog(null, "Id User wajib diisi");
                this.id_user="-";
            } else {
                this.id_user=id_user;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setTotal_point(int total_point) {
        try {
            // area koding benar
            if (total_point < 0) {
                JOptionPane.showMessageDialog(null, "Total Point tidak Boleh minus");
                this.total_point = 0;
            } else {
                this.total_point = total_point;
            }
        } catch (Exception salah) {
            // area kode jika salah
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getId_user() {
        return id_user;
    }

    public int getTotal_point() {
        return total_point;
    }
    
    public String infoUser(){   
    String pesan ="\n ID User : " + getId_user()+
                "\n Total Point : " + getTotal_point();
    return pesan;
    }
    
    public void infoUserPopup(){
        String pesan = "ID User : " + getId_user() + "\n"
                    + "Total Point : " + getTotal_point();
        JOptionPane.showMessageDialog(null, pesan, "Data Point",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
