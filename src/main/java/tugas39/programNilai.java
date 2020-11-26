/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas39;
import java.util.Scanner;

/**
 *
 * @author
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class programNilai {
    String petugas;
    int jumlahMahasiswa;
    double[] nilaiMahasiswa;
    double totalNilai;
    double nilaiTerbesar = 0;
    double nilaiTerkecil = 0;
    
    public void inputNilai(){
        var keyboard = new Scanner(System.in);
        System.out.println("====Program Nilai Terbesar dan Terkecil Mahasiswa====");
        System.out.println("Masukan Nama Petugas: ");
        petugas = keyboard.nextLine();
        System.out.println("Masukan Banyaknya Mahasiswa: ");
        jumlahMahasiswa = keyboard.nextInt();
        nilaiMahasiswa = new double[jumlahMahasiswa];
        for(var i=0; i<jumlahMahasiswa;i++){
            System.out.println("Masukan Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMahasiswa[i] = keyboard.nextDouble();
        }
    }
    public double hitungNilaiTerbesar(){
        for(var i=0;i<jumlahMahasiswa;i++){
            if(i==0){
                nilaiTerbesar = nilaiMahasiswa[i];
            }else{
                if(nilaiTerbesar<nilaiMahasiswa[i]){
                    nilaiTerbesar = nilaiMahasiswa[i];
                }else{
                    nilaiTerbesar = nilaiTerbesar;
                }
            }
        }
        return nilaiTerbesar;
    }
    public double hitungNilaiTerkecil(){
        for(var i=0;i<jumlahMahasiswa;i++){
            if(i==0){
                nilaiTerkecil = nilaiMahasiswa[i];
            }else{
                if(nilaiTerkecil>nilaiMahasiswa[i]){
                    nilaiTerkecil = nilaiMahasiswa[i];
                }else{
                    nilaiTerkecil = nilaiTerkecil;
                }
            }
        }
        return nilaiTerkecil;
    }
    
}
