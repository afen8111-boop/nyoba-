package BELAJARJAVAM3;
import java.util.Scanner;
public class latihans {
public static void main (String[]args) {
    //deklarasi scanner 
   Scanner scanner = new Scanner (System.in);
   String namabarang; 
   int jumlahbarang = 2, harga = 2,total = 2; 
    System.out.print("Input nama = ");
    namabarang = scanner.nextLine();
    System.out.print( "Input jumlah barang");
    jumlahbarang = scanner.nextInt();
    System.out.print( "Input harga barang");
    harga = scanner.nextInt();
    total = harga * jumlahbarang;
    System.out.print("Total = " + total + "nama barang =" + namabarang);
    scanner.close ();
}
}
