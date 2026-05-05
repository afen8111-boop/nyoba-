package tugas; 

import java.util.Scanner; 

public class kuis{ 
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        double standarbawah = 50.0; 
        double standaratas = 90.0; 
        
        for (int i = 1; i <= 4; i++ ){
            System.out.print("Masukan berat badan pasien ke- "+i+ " = ");
            double berat = sc.nextDouble();

            if (berat < standarbawah || berat > standaratas){
                System.out.println("Status = perlu perhatian. ");
            } else {
                System.out.println("Status = normal.");
            }
            System.out.println("----------------------------------------------------");
        }
        System.out.println("Proses sudah selesai ");
        sc.close();
    }
}