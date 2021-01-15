
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class FungsiPengembalianNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        //membuat objek scan dari class library scanner//
        Scanner masukan = new Scanner(System.in);
        //deklarasi variabel//
        int a, b, c;
        
        //output//
        System.out.println("Program Menjumlahkan 2 Nilai");
       
        //menbuat perintah inputan user//
        //yang berisi nilai/value dari inputan user di objek masukan/input
        //lalu nextInt() membuat baris baru angka dibawah           
        System.out.print("Masukkan nilai a : ");
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = masukan.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = masukan.nextInt();
        
        //menampilkan output hasil
        System.out.println();
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("Jumlah a + c : "+(jumlah(a,c)));
        }
    
    //konstruktor//
    //fungsi pengembalian nilai jumlah//
    private static int jumlah(int a, int b){
        int hasil = a + b;
        return hasil;
    }
    
}
