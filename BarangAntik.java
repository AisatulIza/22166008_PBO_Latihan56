/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166008_pbo_lat56;

/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Semester  : 3
* Prodi     : Sistem Informasi
* Matkul    : PBO
**/
//kelas Barangantik
public class BarangAntik {
    //variabel
    int umur;
    //konstruktor
    public BarangAntik(int umur) {
        this.umur = umur;
    }
    //metode tampilumur 
    public void tampilUmur() {
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun");
    }
}
//kelas radio turunan dari kelas barangantik
class Radio extends BarangAntik {
    //variabel
    private String name;
    //konstruktor
    public Radio(String name, int umur) {
        super(umur);
        this.name = name;
    }
    //metode get 
    public String getName() {
        return name;
    }
    //metode set untuk mengubah nilai variabel name
    public void setName(String name) {
        this.name = name;
    }
    //metode menjalankan program
     public static void main(String[] args) {
        Radio radio1 = new Radio("Radio AM", 234);
        System.out.println("Nama barang Antik: " + radio1.getName());
        radio1.tampilUmur();
    }
    
}
