package UTSS;
import java.util.Scanner;
public class UTS {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pelanggan (minimal 3): ");
        int jumlahPelanggan = sc.nextInt();
        if (jumlahPelanggan < 3) {
            System.out.println("Jumlah pelanggan minimal 3. Otomatis menggunakan 3 pelanggan.");
            jumlahPelanggan = 3;
        }
        sc.nextLine(); // Consume newline
        
        // Deklarasi array 1 dimensi
        String[] namaPelanggan = new String[jumlahPelanggan];
        String[] namaProvider = new String[jumlahPelanggan];
        String[] jenisPaket = new String[jumlahPelanggan];
        int[] nominal = new int[jumlahPelanggan];        
        
        // Nominal yang sudah ditentukan
        int[] pilihanNominal = {210000, 50000, 25000, 15000};
        
        for ( int i = 0 ; i < jumlahPelanggan ; i++){
            System.out.println("\n--- Data Pelanggan ke-" + (i+1) + " ---");
            System.out.print("Masukan Nama pelanggan = ");
            namaPelanggan[i] = sc.nextLine();
            
            System.out.print("Masukan Nama Provider = ");
            namaProvider[i] = sc.nextLine();
            
            System.out.print("Masukan Jenis Paket = ");
            jenisPaket[i] = sc.nextLine();
            
            boolean nominalValid = false;
            while (!nominalValid) {
                System.out.print("Masukan Nominal (Pilihan: 210000, 50000, 25000, 15000) = ");
                int inputNominal = sc.nextInt();
                sc.nextLine(); // Consume newline
                
                // Validasi input nominal dengan array nominal yang sudah ditentukan
                for (int n : pilihanNominal) {
                    if (inputNominal == n) {
                        nominalValid = true;
                        break;
                    }
                }
                
                if (nominalValid) {
                    nominal[i] = inputNominal;
                } else {
                    System.out.println("Nominal tidak sesuai! Harap masukkan nominal yang sudah ditentukan.");
                }
            }
        }

        // Menampilkan output dari transaksi
        System.out.println("\n=== DATA TRANSAKSI PULSA ===");
        for (int i = 0; i < jumlahPelanggan; i++) {
            System.out.println("Pelanggan " + (i+1) + ": " + namaPelanggan[i]);
            System.out.println("  Provider : " + namaProvider[i]);
            System.out.println("  Paket    : " + jenisPaket[i]);
            System.out.println("  Nominal  : Rp" + nominal[i]);
            System.out.println("---------------------------------");
        }
        
        sc.close();
    }
}