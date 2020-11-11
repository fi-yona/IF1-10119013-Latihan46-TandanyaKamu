/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan46.tandanyakamu;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;

        
public class OOTandanyaKamu {
    
    private int yearBirth;
    private int yearNow = 2020;
    private static String red = "\u001b[31m";
    
    public void Age(int yearNow){
        this.yearNow = yearNow;
    }       
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow(){
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        String ket = null;
        if(0<=umur && umur<=5){
            ket = "LAGI LUCU-LUCUNYA";
        }if(5<umur && umur<=10){
            ket = "MASIH ANAK-ANAK";
        }if(10<umur && umur<=13){
            ket = "MASIH REMADJA";
        }if(13<umur && umur<=19){
            ket = "ALAY";
        }if(19<umur && umur<=29){
            ket = "LAGI GALAU NYARI JODOH";
        }if(29<umur && umur<=35){
            ket = "LAGI SIBUK NYARI UANG";
        }if(35<umur && umur<=150){
            ket = "SUDAH TUA";
        }if(0>umur && umur>150){
            ket = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        return ket;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        OOTandanyaKamu oo = new OOTandanyaKamu();
        System.out.print("Masukkan tahun lahir anda : ");
        oo.setYearBirth(scan.nextInt());
        System.out.println();
        System.out.println("=====HASIL PERHITUNGAN UMUR=====");
        System.out.println("Tahun lahir anda : " + oo.getYearBirth());
        System.out.println("Hari ini tahun : " + oo.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + oo.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + oo.red + oo.tandanyaKamu(oo.hitungUmur()));
    }
    
}
