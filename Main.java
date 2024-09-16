/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        // Create an object of Pekerja
        Pekerja pekerja1 = new Pekerja("Andi", 20, "Front-End Developer", 10000000);

        // Display the worker's information using toString
        System.out.println(pekerja1.toString());

        // Change the worker's name using the setter
        pekerja1.setNama("Joko");
        
        
        // Display the updated worker's information
        System.out.println(pekerja1.toString());

    }
}

