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
public class Tabung extends BangunRuang{
    public double r, t;
    
    @Override
    public double hitungLuas() {
        return (2 * Math.PI * this.r * this.t) + (2 * Math.PI * Math.pow(this.r, 2));
    }
    
    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(this.r, 2) * this.t;
    }
}
