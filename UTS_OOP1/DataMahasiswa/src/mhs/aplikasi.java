/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mhs;

import java.util.*;
/**
 *
 * @author ASUS
 */
public class aplikasi {
    public static void main(String[] args) {
        aplikasi app = new aplikasi();
        Scanner sc = new Scanner(System.in);
        while (true) {            
            app.printMenu();
            int pilihan = sc.nextInt();
            switch (pilihan){
                case 1:
                    System.out.println("===========");
                    System.out.println("Tambah Data");
                    System.out.println("===========");
                    app.addData();
                    break;
                case 2:
                    System.out.println("===========");
                    System.out.println("Ubah Data");
                    System.out.println("===========");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("===========");
                    System.out.println("Hapus Data");
                    System.out.println("===========");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("============");
                    System.out.println("List Data");
                    System.out.println("=============");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }
    public void addData(){
        System.out.println("Silahkan isi data diri");
        Scanner sc = new Scanner(System.in);
        System.out.print("NIM : ");
        String NIM = sc.nextLine();
        System.out.print("Nama : ");
        String Nama = sc.nextLine();
        System.out.print("Kelas : ");
        String Kelas = sc.nextLine();
        System.out.print("Jurusan : ");
        String Jurusan = sc.nextLine();
        System.out.print("Alamat : ");
        String Alamat = sc.nextLine();
        //simpan data
        operasi.addData(new data(NIM, Nama, Kelas, Jurusan, Alamat));
    }
    public void ubahData(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Ubah data ke : ");
        int idx = Integer.parseInt(sc.nextLine());
        System.out.println("==============================");
        System.out.print("NIM : ");
        String NIM = sc.nextLine();
        System.out.print("Nama : ");
        String Nama = sc.nextLine();
        System.out.print("Kelas : ");
        String Kelas = sc.nextLine();
        System.out.print("Jurusan : ");
        String Jurusan = sc.nextLine();
        System.out.print("Alamat : ");
        String Alamat = sc.nextLine();
        //simpan perubahan
        operasi.editData(new data(NIM, Nama, Kelas, Jurusan, Alamat), idx - 1);
    }
    public void hapusData(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Hapus data ke : ");
        int idx = sc.nextInt();
        //hapus data
        operasi.removeData(idx - 1);
    }
    public void listData(){
        List<data> result = operasi.getListData();
        for (int i = 0; i <result.size(); i++) {
            System.out.println();
            System.out.println("data ke : " + (i + 1));
            System.out.println("NIM :" + result.get(i).getNim());
            System.out.println("Nama :" + result.get(i).getNama());
            System.out.println("Kelas :" + result.get(i).getKelas());
            System.out.println("Jurusan :" + result.get(i).getJurusan());
            System.out.println("Alamat :" + result.get(i).getAlamat());
        }
    }
    public void printMenu(){
        System.out.println();
        System.out.println("======================================");
        System.out.println("APLIKASI PEREKAMAN DATA MAHASISWA");
        System.out.println("======================================");
        System.out.println("Pilih menu :");
        System.out.println("1. Tambah Data :");
        System.out.println("2. Ubah Data :");
        System.out.println("3. Hapus Data :");
        System.out.println("4. Lihat Data :");
        System.out.println("5. keluar");
        System.out.print("Pilihan :");
    }
}
