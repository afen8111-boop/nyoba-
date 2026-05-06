package UTS;
import java.util.Scanner;
public class latihanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] poinsskm = new int[4];
        String [] nama = new String[4];
        for(int i = 0; i < 4; i++){
            System.out.print("masukan nama ke " + i + " :");
            nama[i] = sc.next();
            System.out.print("masukan poin ke " + i + " :");
            poinsskm[i] = sc.nextInt();
        }
        
    }
}
