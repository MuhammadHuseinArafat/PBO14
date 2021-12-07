/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author hp
 */
public abstract class BangunDatar {
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    public void tampilHasil(){
        
        System.out.println("Luas adalah : " + this.hitungLuas());
        System.out.println("Keliling adalah : " + this.hitungKeliling());
       
    }

}
