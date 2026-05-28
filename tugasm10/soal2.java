
public class soal2 {
    public static boolean isGanjil(int angka) {
        return angka % 2 != 0;
    }
    public static void main(String[] args) {
        int angka1 = 7;
        int angka2 = 10;
        int angka3 = -3;

        System.out.println("Apakah " + angka1 + " ganjil? " + isGanjil(angka1)); 
        System.out.println("Apakah " + angka2 + " ganjil? " + isGanjil(angka2));
        System.out.println("Apakah " + angka3 + " ganjil? " + isGanjil(angka3)); 
    }
}