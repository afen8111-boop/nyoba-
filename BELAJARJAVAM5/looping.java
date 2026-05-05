package BELAJARJAVAM5;
import java.util.Scanner;
public class looping {
    public static void main (String[]args){
        Scanner cs = new Scanner (System.in);
        /*
        Membuat program untuk menghitung total SSKM berdasarkan kegiatan 
        dan poin SSKM kegiatan yang diinputkan.
        kegiatan bisa diinput hingga 5 data 
        Output : 
        bimbingan karir - 5 poin 
        semianr - 3 poin 
        total : 8 poin 
        */
    String NamaKegiatan="";
    int poinSSKM = 0, total = 0;
    for (int i =0; i < 6 ; i++ ) {
        System.out.println("Data ke = " + (1+i));
        System.out.print("Nama Kegiatan ke-"+ (i+1)+ "= " );
        NamaKegiatan = cs.nextLine();
        System.out.print("Poin SSKM = ");
        poinSSKM = cs.nextInt();
        System.out.println();
        cs.nextLine();    
        total += poinSSKM;     
    }
    System.out.println("Total nya cuy = " + total);
    cs.close();
    }
}
