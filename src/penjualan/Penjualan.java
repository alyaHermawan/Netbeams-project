/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penjualan;

/**
 *
 * @author User
 */
public class Penjualan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrameApp app =  new FrameApp();
        app.setVisible(true);
        
         // Objek User + Transaksi
        transaksi Transaksi = new transaksi();
        Transaksi.setId_user("U001");
        Transaksi.setTotal_point(200);
        Transaksi.setId_transaksi("T001");
        Transaksi.setNama_depan("Dani");
        Transaksi.setNama_belakang("Saputra");
        Transaksi.setPhone("08123456789");
        Transaksi.setCity("Bandung");
        Transaksi.setAddress("Jl. Merdeka No. 10");
        Transaksi.setStatus("Selesai");
        System.out.println("=== Data Transaksi ===");
        System.out.println(Transaksi.infoTransaksi());
        
        // Objek Transaksi Detail
        transaksiDetail detail = new transaksiDetail();
        detail.setId_user("U002");
        detail.setTotal_point(300);
        detail.setId_transaksi("T002");
        detail.setNama_depan("Rina");
        detail.setNama_belakang("Putri");
        detail.setPhone("08129876543");
        detail.setCity("Jakarta");
        detail.setAddress("Jl. Sudirman No. 20");
        detail.setStatus("Pending");
        detail.setId_detail("TD001");
        detail.setQuantity(5);
        
        System.out.println("\n === Data Detail Transaksi ===");
        System.out.println(detail.infoDetail());

        // Objek Point
        point Point = new point();
        Point.setId_user("U003");
        Point.setTotal_point(150);
        Point.setId_point("P001");
        Point.setNominal_point(75);
        
        System.out.println("\n === Data Point ===");
        System.out.println(Point.infoPoint());
    }
}
