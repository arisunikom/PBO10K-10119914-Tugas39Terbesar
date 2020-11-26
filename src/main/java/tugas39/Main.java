/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas39;

/**
 *
 * @author
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class Main {
    public static void main(String[] args) {
        programNilai programNilai = new programNilai();
        programNilai.inputNilai();
        System.out.println("Nilai Terbesar: "+programNilai.hitungNilaiTerbesar());
        System.out.println("Nilai Terkecil: "+programNilai.hitungNilaiTerkecil());
        System.out.println("Nama Petugas: "+programNilai.petugas);
    }
    
}
