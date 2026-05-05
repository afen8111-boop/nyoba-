package BELAJARJAVAM3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class java{
        public static void main (String[]args)throws IOException{
            float angka = 5;
            float angka2 = 2;
            float hasil;
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            //bufferedreader digunakan untuk mengisi inputan (string)
            //untuk konversi tipe data ke float menggunakan parsefloat
            System.out.print("Angka 1 =");
            angka = Float.parseFloat(br.readLine());
            System.out.print("Angka 2 =");
            hasil = angka/angka2;
            System.out.println("hasil= " +hasil);
        }
    }

