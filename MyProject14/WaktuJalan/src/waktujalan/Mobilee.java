/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waktujalan;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Mobilee {
    String [] mobil = {"A", "B", "C", "D", "E", "F"};
     String [] mobilJenis = {"Sedan", "SUV", "MPV"};
     int [] mobilJarak = {155, 535, 659, 530, 539, 431};
     String [] mobilAsal = {"Solo"};
     String [] mobilTujuan = {"Kudus", "Jakarta", "Banten", "Bandung", "Banyuwangi", "Jember"};
     double [] mobilKecepatan = {60, 65, 57, 62, 64, 53};
     Scanner idinput = new Scanner(System.in);
     double jrk;
     double wktu;
     int bahanBakar;
     int jml;
    private int jarak;
    private double waktu;
    
    public void ketMobil(){
        this.mobil[0] = "A";
        this.mobil[1] = "B";
        this.mobil[2] = "C";
        this.mobil[3] = "D";
        this.mobil[4] = "E";
        this.mobil[5] = "F";
    }
    
    public void lamaPerjalanan(){
        for(int i=0; i<6; i++){
            if("A".equals(this.mobil[i])){
                this.jarak = 155;
                this.waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Mobil " + this.mobil[i] + " adalah " + String.format("%.2f", this.waktu) + " jam");
            }
            if("B".equals(this.mobil[i])){
                jarak = 535;
                waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Mobil " + this.mobil[i] + " adalah " +String.format("%.2f", this.waktu) + " jam");
            }
            if("C".equals(this.mobil[i])){
                jarak = 659;
                waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Mobil " + this.mobil[i] + " adalah " +String.format("%.2f", this.waktu) + " jam");
            }
            if("D".equals(this.mobil[i])){
                jarak = 530;
                waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Mobil " + this.mobil[i] + " adalah " +String.format("%.2f", this.waktu) + " jam");
            }
            if("E".equals(this.mobil[i])){
                jarak = 539;
                waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Mobil " + this.mobil[i] + " adalah " +String.format("%.2f", this.waktu) + " jam");
            }
            if("F".equals(this.mobil[i])){
                jarak = 431;
                waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Mobil " + this.mobil[i] + " adalah " +String.format("%.2f", this.waktu) + " jam");
            }
                    
        }
    }
    
    
    public int bahanBakar(String x){
        for(int i=0; i<3; i++){
            if(null != x)switch (x) {
                case "SEDAN":
                    this.bahanBakar = 10;
                    break;
                case "SUV":
                    this.bahanBakar = 12;
                    break;
                case "MPV":
                    this.bahanBakar = 14;
                    break;
                default:
                    break;
            }       
        }
        return bahanBakar;
    }
    
    public void jmlBBM(){
         for(int i=0; i<6; i++){
            if(null != this.mobil[i])switch (this.mobil[i]) {
                 case "A":
                     this.jml = this.mobilJarak[i] * this.bahanBakar("SEDAN");
                     System.out.println("Bahan bakar untuk Mobil " + this.mobil[i] + " adalah " + this.jml);
                     break;
                 case "B":
                     this.jml = this.mobilJarak[i] * this.bahanBakar("SEDAN");
                     System.out.println("Bahan bakar untuk Mobil " + this.mobil[i] + " adalah " + this.jml);
                     break;
                 case "C":
                     this.jml = this.mobilJarak[i] * this.bahanBakar("SUV");
                     System.out.println("Bahan bakar untuk Mobil " + this.mobil[i] + " adalah " + this.jml);
                     break;
                 case "D":
                     this.jml = this.mobilJarak[i] * this.bahanBakar("SUV");
                     System.out.println("Bahan bakar untuk Mobil " + this.mobil[i] + " adalah " + this.jml);
                     break;
                 case "E":
                     this.jml = this.mobilJarak[i] * this.bahanBakar("MPV");
                     System.out.println("Bahan bakar untuk Mobil " + this.mobil[i] + " adalah " + this.jml);
                     break;
                 case "F":
                     this.jml = this.mobilJarak[i] * this.bahanBakar("MPV");
                     System.out.println("Bahan bakar untuk Mobil " + this.mobil[i] + " adalah " + this.jml);   
                     break;
                 default:
                     break;
             }   
        }
    }
}
