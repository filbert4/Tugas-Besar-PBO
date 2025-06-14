/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlightAdministration;

import static FlightAdministration.ticketUI.rs;

/**
 *
 * @author acern
 */
abstract public class Tiket {
    private String ID_Tiket;
    private String Nama_Penumpang;
    private String Kelas;
    private String Penerbangan;
    private String Kursi;
    private String Tujuan;
    private String Waktu_Berangkat;

    public Tiket(String ID_Tiket, String Nama_Penumpang, String Kelas, String Penerbangan, String Kursi, String Tujuan, String Waktu_Berangkat) {
        this.ID_Tiket = ID_Tiket;
        this.Nama_Penumpang = Nama_Penumpang;
        this.Kelas = Kelas;
        this.Penerbangan = Penerbangan;
        this.Kursi = Kursi;
        this.Tujuan = Tujuan;
        this.Waktu_Berangkat = Waktu_Berangkat;
    }

    public String getID_Tiket() {
        return ID_Tiket;
    }

    public void setID_Tiket(String ID_Tiket) {
        this.ID_Tiket = ID_Tiket;
    }

    public String getNama_Penumpang() {
        return Nama_Penumpang;
    }

    public void setNama_Penumpang(String Nama_Penumpang) {
        this.Nama_Penumpang = Nama_Penumpang;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public String getPenerbangan() {
        return Penerbangan;
    }

    public void setPenerbangan(String Penerbangan) {
        this.Penerbangan = Penerbangan;
    }

    public String getKursi() {
        return Kursi;
    }

    public void setKursi(String Kursi) {
        this.Kursi = Kursi;
    }

    public String getTujuan() {
        return Tujuan;
    }

    public void setTujuan(String Tujuan) {
        this.Tujuan = Tujuan;
    }

    public String getWaktu_Berangkat() {
        return Waktu_Berangkat;
    }

    public void setWaktu_Berangkat(String Waktu_Berangkat) {
        this.Waktu_Berangkat = Waktu_Berangkat;
    }
    
    
    
    
}
