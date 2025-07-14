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
public class transaksi extends user {
    public String id_transaksi;
    public String nama_depan;
    public String nama_belakang;
    public String phone;
    public String city;
    public String address;
    public String status;
    
    public transaksi(){}

    public transaksi(String id_transaksi, String nama_depan, String nama_belakang, String phone, String city, String address, String status) {
        this.id_transaksi = id_transaksi;
        this.nama_depan = nama_depan;
        this.nama_belakang = nama_belakang;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.status = status;
    }

    public void setId_transaksi(String id_transaksi) {
        try {
            if(id_transaksi.equals(null) || id_transaksi.equals("")){
                JOptionPane.showMessageDialog(null, "Id Transaksi wajib diisi");
                this.id_transaksi="-";
            } else {
                this.id_transaksi=id_transaksi;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setNama_depan(String nama_depan) {
        try {
            if(nama_depan.equals(null) || nama_depan.equals("")){
                JOptionPane.showMessageDialog(null, "Nama Depan wajib diisi");
                this.nama_depan="-";
            } else {
                this.nama_depan=nama_depan;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setNama_belakang(String nama_belakang) {
        try {
            if(nama_belakang.equals(null) || nama_belakang.equals("")){
                JOptionPane.showMessageDialog(null, "Nama Belakang wajib diisi");
                this.nama_belakang="-";
            } else {
                this.nama_belakang=nama_belakang;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setPhone(String phone) {
        try {
            if(phone.equals(null) || phone.equals("")){
                JOptionPane.showMessageDialog(null,  "Phone wajib diisi");
                this.phone="-";
            } else {
                this.phone=phone;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setCity(String city) {
        try {
            if(city.equals(null) || city.equals("")){
                JOptionPane.showMessageDialog(null, "City wajib diisi");
                this.city="-";
            } else {
                this.city=city;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setAddress(String address) {
        try {
            if(address.equals(null) || address.equals("")){
                JOptionPane.showMessageDialog(null, "Address wajib diisi");
                this.address="-";
            } else {
                this.address=address;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setStatus(String status) {
        try {
            if(status.equals(null) || status.equals("")){
                JOptionPane.showMessageDialog(null, "Status wajib diisi");
                this.status="-";
            } else {
                this.status=status;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
    }
    }

    public String getId_transaksi() {
        return id_transaksi;
    }

    public String getNama_depan() {
        return nama_depan;
    }

    public String getNama_belakang() {
        return nama_belakang;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }
        
    
    public String infoTransaksi(){   
    String pesan =super.infoUser()+
                "\n ID Transaksi : " + getId_transaksi()+
                "\n Nama Depan : " + getNama_depan() +  
                "\n Nama Belakang : " + getNama_belakang() +
                "\n Phone : " + getPhone() +
                "\n City : " + getCity() +
                "\n Address : " + getAddress() +
                "\n Status : " + getStatus();
    return pesan;
    }
    
    public void infoTransaksiPopup(){
        String pesan = "ID Transaksi : " + getId_transaksi() + "\n"
                    + "Nama Depan : " + getNama_depan() + "\n"
                    + "Nama Belakang : " + getNama_belakang() + "\n"
                    + "Phone : " + getPhone() + "\n"
                    + "City : " + getCity() + "\n"
                    + "Address : " + getAddress() + "\n"
                    + "Status : " + getStatus();
        JOptionPane.showMessageDialog(null, pesan, "Data Transaksi",JOptionPane.INFORMATION_MESSAGE);
    }
}
