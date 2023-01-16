/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.model;

/**
 *
 * @author ASUS
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ASUS
 */
public class Pelanggan {
    private String kode;
    private String namapelanggan;
    private int jenispelanggan;

    public Pelanggan() {
    }

    public Pelanggan(String kode, String namapelanggan, int jenispelanggan) {
        this.kode = kode;
        this.namapelanggan = namapelanggan;
        this.jenispelanggan = jenispelanggan;
    }


    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public int getJenispelanggan() {
        return jenispelanggan;
    }

    public void setJenispelanggan(int jenispelanggan) {
        this.jenispelanggan = jenispelanggan;
    }
    
    

}
