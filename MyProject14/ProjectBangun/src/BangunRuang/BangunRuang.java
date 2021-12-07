/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;

/**
 *
 * @author hp
 */
public abstract class BangunRuang {
   public abstract double hitungLuas();
    public abstract double hitungVolume();
    public void hasil(){
        System.out.println("Luas adalah : " + this.hitungLuas());
        System.out.println("Volume adalah : " + this.hitungVolume());
    }
     
}
