/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mhs;

/**
 *
 * @author ASUS
 */
public class data {
    private String Nim;
    private String Nama;
    private String Kelas;
    private String Jurusan;
    private String Alamat;
    
    public data(){
        Nim = "";
        Nama = "";
        Kelas = "";
        Jurusan = "";
        Alamat = "";
    }
    public data(String Nim, String Nama, String Kelas, String Jurusan, String Alamat){
        this.Nim = Nim;
        this.Nama = Nama;
        this.Kelas = Kelas;
        this.Jurusan = Jurusan;
        this.Alamat = Alamat;
    }
    public void setNim(String Nim){
        this.Nim = Nim;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setKelas(String Kelas){
        this.Kelas = Kelas;
    }
    public void setJurusan(String Jurusan){
        this.Jurusan = Jurusan;
    }
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    public String getNim(){
        return Nim;
    }
    public String getNama(){
        return Nama;
    }
    public String getKelas(){
        return Kelas;
    }
    public String getJurusan(){
        return Jurusan;
    }
    public String getAlamat(){
        return Alamat;
    }
}
