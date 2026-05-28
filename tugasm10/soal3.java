public class soal3 {
    public static int getNilaiMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array tidak boleh kosong");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) { 
        int[] kumpulanAngka = {12, 45, 7, 89, 23, 54};
        int nilaiTerbesar = getNilaiMax(kumpulanAngka);        
        System.out.println("Nilai tertinggi dari array adalah: " + nilaiTerbesar); 
    }
}