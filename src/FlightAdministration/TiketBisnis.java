/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlightAdministration;

/**
 *
 * @author acern
 */
public class TiketBisnis extends Tiket{
    private boolean food;

    public TiketBisnis(boolean food, String ID_Tiket, String Nama_Penumpang, String Kelas, String Penerbangan, String Kursi, String Tujuan, String Waktu_Berangkat) {
        super(ID_Tiket, Nama_Penumpang, Kelas, Penerbangan, Kursi, Tujuan, Waktu_Berangkat);
        this.food = food;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }
    
    
}
