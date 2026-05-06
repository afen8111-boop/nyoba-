package UTS;

public class array2dimensi {
    public static void main(String[] args) {

        // String[][] kontol = new String[2][3];
        // kontol[0][0] = "ANjing";
        // kontol[0][1] = "Babi";
        // kontol[0][2] = "Tupai";
        // kontol[1][0] = "Kera";
        // kontol[1][1] = "Ular";
        // kontol[1][2] = "Kucing";
        // // System.out.println(kontol[1][2]);



        // String[][] nama = {
        // {"Andi","anjay"},
        // {"kontol","memek"}
        // };
        // System.out.println(nama[1][0]);
        // System.out.print(nama[0][1]);
        // System.out.println(nama[1][1]);
        // System.out.println(nama[0][0]);

        
        String[][] nama= {
            {"steven", "denis", "nopal"},
            {"daniel","gerald", "gabriel"},
            {"sebas", "paler", "onel"},
        };
        for (int i = 0; i < nama.length; i++){
            for (int j = 0; j < nama[i].length; j++){
                System.out.print(nama[i][j]);
            }
            System.out.println(" ");
        }
    }
}
            