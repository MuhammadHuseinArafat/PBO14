/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waktujalan;

/**
 *
 * @author hp
 */
public class WaktuJalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mobilee y = new Mobilee() {};
        System.out.println("");
        System.out.println("----SELAMAT DATANG------");
        System.out.println("");
        System.out.println("Berikut waktu yang dibutuh kan pada tiap mobil :");
        y.lamaPerjalanan();
        System.out.println("");
        System.out.println("Berikut Bahan bakar yang dibutuh kan pada tiap mobil :");
        y.jmlBBM();
        System.out.println("");
        System.out.println("::::::>> NUWUN <<:::::::");
    }
    }
    

