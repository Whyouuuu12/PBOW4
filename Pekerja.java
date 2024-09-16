/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author hp
 */
public class Pekerja extends Manusia {
    private double gaji;

    // Constructor for Pekerja
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Call the parent constructor
        this.gaji = gaji;
    }

    // Getter and Setter for gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override toString() method to display all information
    @Override
    public String toString() {
        return "Nama: " + getNama() + ", Usia: " + usia + " tahun, Pekerjaan: " + pekerjaan + ", Gaji: Rp" +String.format("%.0f", gaji);
    }
}
